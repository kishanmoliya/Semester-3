const express = require('express');
const app = express();

app.get('/', (req,res) => {
    res.sendFile(__dirname + '/test.html')
})

app.listen(3000, () => {
    console.log("Server Started http://localhost:3000");
})