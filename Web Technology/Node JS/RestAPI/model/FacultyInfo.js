const mongoose = require('mongoose');

const schema =mongoose.Schema({
    FacultyName:String,
    FacultyID:Number
})
module.exports=mongoose.model("FacultyInfo",schema,"rajeshwars");