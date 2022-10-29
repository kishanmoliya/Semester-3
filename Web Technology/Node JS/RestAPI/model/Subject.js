const mongoose = require('mongoose');

const schema = mongoose.Schema({
    Semester: Number,
    Subjects: Number,
    SubjectCode: String,
    SubjectName: String,    
    SubTaughtBy: String
});

module.exports = mongoose.model('Subject', schema);