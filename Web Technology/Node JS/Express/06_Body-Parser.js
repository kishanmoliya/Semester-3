const express = require('express');
const bodyParser =  require('body-parser');
const app = express();
app.use(bodyParser.urlencoded({ extended: false}));

app.get('/get/:id',(req,rea) => {
    console.log(req.params);
    res.send("good morning")
})

app.post('/post',(req,res) => {
    console.log(req.body);
    req.send("Good morning");
})

app.listen(3000, () => {
    console.log("Server Started @ http://localhost:3000");
})