const mongoose = require('mongoose');

mongoose.connect(process.env.DATABASE).then(() => {
    console.log('Connection successful');
}).catch((err) => console.log(`No Connection`)); 