const dotenv = require('dotenv');
const mongoose = require('mongoose');
const express = require('express');
const app = express();

dotenv.config({path:'./config.env'});
require('./db/connection')

const PORT = process.env.PORT;

//Middelware
const middelware = (req, res, next) => {
    console.log(`middelWork work`)
    next();
}

app.get('/', (req, res) => {
    res.send(`it's home page`);
});

app.get('/about', middelware, (req, res) => {
    res.send(`it's home about`);
});

app.get('/contactus', (req, res) => {
    res.send(`it's home contactus`);
});

app.listen(PORT, () => {
    console.log(`Server Statrted at port no ${PORT}...`)
})