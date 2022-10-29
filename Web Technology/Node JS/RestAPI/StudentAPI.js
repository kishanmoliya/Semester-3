const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const cors = require('cors');
const Student = require('./model/Student');

mongoose.connect('mongodb://localhost:27017/collages').then(() => {
    const app = express();
    app.use(bodyParser.urlencoded({ extended: false }))
    app.use(cors());

    app.get('/students', async (req,res) => {
        const data = await Student.find();
        res.send(data); 
    });
    
    app.get('/student/:id', async (req,res) => {
        const data = await Student.findOne({ EnrollNo:req.params.id });
        res.send(data); 
    });

    app.delete('/student/:id', async (req,res) => {
        const data = await Student.deleteOne({EnrollNo:req.params.id});
        res.send(data); 
    });

    app.post('/student', async (req,res) => {
        const stu = await Student();
        stu.EnrollNo = req.body.EnrollNo;
        stu.Name = req.body.Name;
        stu.MobileNo = req.body.MobileNo;
        stu.Attendance = req.body.Attendance;
        stu.Result = req.body.Result;
        stu.Backlog = req.body.Backlog;

        const data = await stu.save();
        res.send(data);
    })

    app.put('/student/:id', async (req,res) => {
        const data = await Student.findOne({ EnrollNo:req.params.id});
        data.EnrollNo = req.body.EnrollNo;
        data.Name = req.body.Name;
        data.MobileNo = req.body.MobileNo;
        data.Attendance = req.body.Attendance;
        data.Result = req.body.Result;
        data.Backlog = req.body.Backlog;

        await data.save();
        res.send(data);
    })

    app.listen(3006, () => {
        console.log('Server Start...');
    })
})
