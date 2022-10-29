const mongoose = require('mongoose');

const schema = mongoose.Schema({
    FacultyId: String,
    FacultyName: String,
    FacultyAge: Number,
    FacultySub: String
});

module.exports = mongoose.model("Faculty",schema);