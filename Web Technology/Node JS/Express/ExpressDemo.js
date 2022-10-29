const express = require('express');
const app = express();

app.get('/', (req,res)=>{
    res.send('Monday successfull, 7/22/2022');
})

app.listen(3000, () => {
    console.log("You did it @ http://localhost:3000/");
});