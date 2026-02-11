const express = require('express');
const app = express();
app.use(express.json()); 
const port = 3000;
app.get('/',(req,res)=>{
    res.send('Hello World!');
});
app.get('/name',(req,res)=>{
    res.send('My name is Dusi');
});
app.post('/name',(req,res)=>{
    const name = req.body.name;
    res.send(`My name is ${name}`);
});
app.listen(port,()=>{
    console.log(`Example app listening at http://localhost:${port}`);
});