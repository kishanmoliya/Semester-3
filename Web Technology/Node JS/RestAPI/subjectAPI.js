const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const Subject = require('./model/Subject');

mongoose.connect('mongodb://localhost:27017/collages').then(() => {
    const app = express();
    app.use(bodyParser.urlencoded({ extended: false }))

    app.get('/semesters', async (req,res) => {
        const data = await Subject.find();
        res.send(data);
    });

    app.get('/semester/:id', async (req,res) => {
        const data = await Subject.findOne({Semester:req.params.id});
        res.send(data);
    });

    app.delete('/semester/:id', async (req,res) => {
        const data = await Subject.deleteOne({Semester:req.params.id});
        res.send(data);
    });

    app.post('/semester', async (req,res) => {
        const sem = await Subject();
        sem.Subjects    =  req.body.Subjects;
        sem.Semester    =  req.body.Semester;
        sem.SubjectCode =  req.body.SubjectCode;
        sem.SubjectName =  req.body.SubjectName;    
        sem.SubTaughtBy =  req.body.SubTaughtBy;

        const data = await sem.save();
        res.send(data);
    });

    app.put('/semester/:id', async (req,res) => {
        const data = await Subject.findOne({Semester:req.params.id});
        data.Subjects    =  req.body.Subjects;
        data.Semester    =  req.body.Semester;
        data.SubjectCode =  req.body.SubjectCode;
        data.SubjectName =  req.body.SubjectName;    
        data.SubTaughtBy =  req.body.SubTaughtBy;

        await data.save();
        res.send(data);
    })

    app.listen(3000, () => {
        console.log("server Start...");
    })
})