const express = require('express');
const app = express();
app.use(express.json()); 
const port = 3000;
const { addUser, getUser } = require('./user');
app.get('/',(req,res)=>{
    res.send('Hello World!');
});

app.get('/name',(req,res)=>{
    res.send('My name is Dusi');
});

app.post('/name',(req,res)=>{
    const name = req.body.name;
    const age = req.body.age;
    var time = new Date().toLocaleDateString();
    res.send(`My name is ${name} and I am ${age} years old. Today's date is ${time}`);
});

app.get('/addition/:num1/:num2',(req,res)=>{
    const num1 = parseFloat(req.params.num1);
    const num2 = parseFloat(req.params.num2);
    const sum = num1 + num2;
    res.send(`The sum of ${num1} and ${num2} is ${sum}`);
});

app.post('/addUser',(req,res)=>{
    const name = req.body.name;
    const age = req.body.age;
    addUser(name, age);
    res.send(`User ${name} added successfully!`);
});

app.get('/getUser/:name',(req,res)=>{
    const name = req.params.name;
    const user = getUser(name);
    if (user) {
        res.send(`User found: Name: ${user.name}, Age: ${user.age}`);
    } else {
        res.send(`User with name ${name} not found.`);
    }
});

app.listen(port,()=>{
    console.log(`Example app listening at http://localhost:${port}`);
});