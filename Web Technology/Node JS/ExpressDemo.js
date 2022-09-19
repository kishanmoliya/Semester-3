const express = require('express');
const app = express();

app.get('/', (req,res)=>{
    res.send('Monday successfull');
})

app.listen(3000, () => {
    console.log("You did it @ http://localhost:3000/");
});