const express = require('express');
const app = express();
app.use('/hiddanImage',express.static('node_modules'));

app.get('/', (req,res) => {
    res.sendFile(__dirname + '/imageDemo.html');
})

app.listen(3000, () => {
    console.log("Server Started http://localhost:3000");
})