const express = require('express');
const app = express();

app.all('/',(req,res,next) => {
    console.log("All Method Called");
    const chackPass = true;
    
    if(chackPass)
        next();
    else    
        res.send("Incorrect Password!"); 
})

app.get('/',(req,res) => {
    res.send("Home Page");
})

app.get('/about',(req,res) => { // -> /user/:userId/books/:bookId
    res.send("About Page");
})

app.delete('/',(req,res) => {
    res.send("This page is Deleted");
})

 app.listen(3000,() => {
    console.log("Server Start @  http://localhost:3000/")
 })                 