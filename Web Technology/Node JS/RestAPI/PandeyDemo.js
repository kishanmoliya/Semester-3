const express= require('express');
const mongoose = require('mongoose');
const FacultyInfo = require('./model/FacultyInfo');
const bodyparser = require('body-parser')


mongoose.connect('mongodb://localhost:27017/pandeys').then(()=>{
    const app=express();
    app.use(bodyParser.urlencoded({ extended: false }))

    app.get('/facultydetails',async(req,res)=>{
        const data = await FacultyInfo.find();
        res.send(data);

    })

    app.get('/facultydetail/:id',async(req,res)=>{
        const data = await FacultyInfo.findOne({FacultyID:req.params.id});
        res.send(data);

    })
    app.delete('/facultydetail/:id',async(req,res)=>{
        const data = await FacultyInfo.deleteOne({FacultyID:req.params.id});
        res.send(data);

    })

    app.post('/facultydetail',async(req,res)=>{
        const fac = await FacultyInfo();
        fac.FacultyN
        

    })



    app.listen(3009,() => {
        console.log('Server Start..');
    
    })
})
