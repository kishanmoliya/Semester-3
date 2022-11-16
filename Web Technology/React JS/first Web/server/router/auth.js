const express = require('express');
const router = express.Router();
const bcrypt = require('bcryptjs');    //for hashing tha password.
const jwt = require('jsonwebtoken');

require('../db/connection');
const User = require('../model/userSchema')

router.get('/', (req, res) => {
    res.send(`It's router home`);
});

// Using Promises!
// router.post('/register', (req, res) => {
//     const { name, email, phone, work, password, cpassword } = req.body;

//     if (!name || !email || !phone || !work || !password || !cpassword) {
//         return res.status(422).json({ error: "Please enter the fild Properly" });
//     }

//     User.findOne({ email: email })
//         .then((userExist) => {
//             if (userExist) {
//                 return res.status(422).json({ error: "Email already Exist" });
//             }
//             const user = new User({ name, email, phone, work, password, cpassword });

//             user.save().then(() => {
//                 res.status(201).json({ message: "Registered Successfuly" })
//             }).catch((err) => res.status(500).json({ error: "Failed to Register" }));

//         }).catch(err => { console.log(err); });
// })


// First Time User Register.
router.post('/register', async (req, res) => {
    const { name, email, phone, work, password, cpassword } = req.body;

    if (!name || !email || !phone || !work || !password || !cpassword) {
        return res.status(422).json({ error: "Please enter the fild Properly" });
    }

    try {
        const userExist = await User.findOne({ email: email });

        if (userExist) {
            return res.status(422).json({ error: "Email already Exist" });   //Check for user already register or not.
        } else if (password != cpassword) {
            return res.status(422).json({ error: "Password are Not Maching" });  //Check password and Conform Password.
        } else {
            const user = new User({ name, email, phone, work, password, cpassword });  // Add User data in "user", And create new Object.

            // Before save the data it will hashing the password in userSchema.
            await user.save();                                                                  // Save the user data in dataBase.

            res.status(201).json({ message: "Registered Successfuly" })
        }

    } catch (err) {
        console.log(err);
    }
});

// Login Rout  
router.post('/signin', async (req, res) => {
    try {
        const { email, password } = req.body;

        if (!email || !password) {
            return res.status(400).json({ error: "Please enter email of password" })
        }

        const userLogin = await User.findOne({ email: email });      // Find the User Email, and save in userLogin.
        if (userLogin) {
            const isMatch = await bcrypt.compare(password, userLogin.password);       // Match the "Registration password" and "login password".

            const token = await userLogin.generateAuthToken();
            console.log(token);

            res.cookie("jwtoken", token, {
                expires: new Date(Date.now() + 2589000000),
                httpOnly:true
            });

            if (!isMatch) {
                res.status(400).json({ error: "Invalid Credientials" })
            } else {
                res.json({ message: "Sign Successfully" })
            }
        } else {
            res.status(400).json({ error: "Invalid Credientials" })
        }

    } catch (err) {
        console.log(err);
    }
});

module.exports = router;