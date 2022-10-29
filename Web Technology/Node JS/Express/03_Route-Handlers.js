const express = require('express');
const app = express();

// app.get('/', (req, res, next) => {
//     console.log("First function");
//     next();
// },
//     (req, res) => {
//         res.send("Second Function");           //Also write more functions... 
//     }
// )

// const fun1 = (req,res,next) => {
//     console.log("function 1");
//     next();
// }
// const fun2 = (req,res,next) => {
//     console.log("function 2");
//     next();
// }
// const fun3 = (req,res) => {
//     res.send("function 3");
// }

// app.get('/',[fun1,fun2,fun3]);



const isUserValid = (req,res,next) => {
    console.log("User is Valid.");
    next();
}

const isaAgeProper = (req,res,next) => {
    console.log("Age is Proper.");
    next();
}

app.get('/', [isUserValid,isaAgeProper,(req,res) => {
    res.send("Home Page");
}])

app.get('/about', [isUserValid,isaAgeProper,(req,res) => {
    res.send("About Page");
}])

app.listen(3000, () => {
    console.log("Server Started @ http//localhost:3000");
})



