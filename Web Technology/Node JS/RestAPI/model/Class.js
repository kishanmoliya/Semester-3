const mongoose = require('mongoose');

const schema = mongoose.Schema({
    ClassNo      : Number,
    classCom     : Number,
    ClassFaculty : String,
    ClassWork    : String
})

module.exports = mongoose.model('Class', schema);