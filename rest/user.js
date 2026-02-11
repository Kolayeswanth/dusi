const express = require('express');
const app = express();
app.use(express.json()); 

const user = []

function addUser(name, age) {
    const newUser = {
        name: name,
        age: age
    };
    user.push(newUser);
}

function getUser(name) {
    return user.find(u => u.name === name);
}

module.exports = { addUser, getUser };