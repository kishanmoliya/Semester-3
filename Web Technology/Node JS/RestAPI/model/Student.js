const mongoose = require('mongoose');

const schema = mongoose.Schema({
    EnrollNo: String,
    Name: String,
    MobileNo: Number,
    Attendance: String,
    Result: String,
    BackLog: Number
});

module.exports = mongoose.model("Student", schema);