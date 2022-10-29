const express = require('express');
const mongoose = require('mongoose');
const Class = require('./model/Class');
const bodyParser = require('body-parser');


mongoose.connect('mongodb://localhost:27017/collages').then(() => {
    const app = express();
    app.use(bodyParser.urlencoded({ extended: false }))

    app.get('/classes', async (req,res) => {
        const data = await Class.find();
        res.send(data);
    })

    app.get('/class/:id', async (req,res) => {
        const data = await Class.findOne({ClassNo: req.params.id});
        res.send(data);
    })

    app.delete('/class/:id', async (req,res) => {
        const data = await Class.deleteOne({ClassNo: req.params.id});
        res.send(data);
    })

    app.post('/class', async (req,res) => {
        const cls = await Class();
        cls.ClassNo      = req.body.ClassNo;
        cls.classCom     = req.body.classCom;
        cls.ClassFaculty = req.body.ClassFaculty;
        cls.ClassWork    = req.body.ClassWork;

        const data = await cls.save();
        res.send(data);
    })

    app.put('/class/:id', async (req,res) => {
        const data = await Class.findOne({ClassNo: req.params.id});
        data.ClassNo      = req.body.ClassNo;
        data.classCom     = req.body.classCom;
        data.ClassFaculty = req.body.ClassFaculty;
        data.ClassWork    = req.body.ClassWork;

        await data.save();
        res.send(data);
    })

    app.listen(3000, () => {
        console.log('Server Started...');
    })
})