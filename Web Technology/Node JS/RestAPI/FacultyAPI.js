const express = require('express');
const mongoose = require('mongoose');
const Faculty = require('./model/Faculty');
const bodyParser = require('body-parser');
const cors = require('cors');

mongoose.connect('mongodb://localhost:27017/collages').then(() => {
    const app = express();

    app.use(bodyParser.urlencoded({ extended: false }))
    app.use(cors());

    app.get('/faculties', async (req, res) => {
        const data = await Faculty.find();
        res.send(data);
    });

    app.get('/faculty/:id', async (req, res) => {
        const data = await Faculty.findOne({ FacultyId: req.params.id });
        res.send(data);
    });

    app.delete('/faculty/:id', async (req, res) => {
        const data = await Faculty.deleteOne({ FacultyId: req.params.id });
        res.send(data);
    });

    app.post('/faculty', async (req, res) => {
        const fac = await Faculty();
        fac.FacultyId = req.body.FacultyId;
        fac.FacultyName = req.body.FacultyName;
        fac.FacultyAge = req.body.FacultyAge;
        fac.FacultySub = req.body.FacultySub;
        const data = await fac.save();
        res.send(data);
    });

    app.put('/faculty/:id', async (req,res) => {
        const data = await Faculty.findOne({FacultyId:req.params.id});
        data.FacultyId = req.body.FacultyId;
        data.FacultyName = req.body.FacultyName;
        data.FacultyAge = req.body.FacultyAge;
        data.FacultySub = req.body.FacultySub;

        await data.save();
        res.send(data);
    });

    app.listen(3005, () => {
        console.log("Server Started for API @3005");
    })
})





