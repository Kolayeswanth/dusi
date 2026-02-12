const express = require("express");
const app = express();
const port = 3000;
app.use(express.json());
const users = [
    {"id":1,"name":"yeswanth","age":21},
    {"id":2,"name":"Dinesh","age":20}
];

app.post('/addUser',(req,res)=>{
    const user = {
    id : users.length+1,
    name : req.body.name,
    age : req.body.age
    };
    users.push(user)
    res.send("User added successfully,"+`id:${user.id},${user.name},${user.age}`);
});

app.get('/findUser/:id',(req,res)=>{
    const u = users.find(u=> u.id==req.params.id);
    if(!u)res.status(404).send(`user not found`);
    res.send(`user found sucessfully, name:${u.name}, age:${u.age}`)

});

app.get('/getAllUsers',(req,res)=>{
    res.send(users);    
});

app.put('/updateUser/:id',(req,res)=>{
    const u = users.find(u=> u.id==req.params.id);
    if(!u)res.status(404).send(`user not found`);
    u.name = req.body.name ? req.body.name : u.name;
    u.age = req.body.age ? req.body.age : u.age;
    res.send(`user updated successfully, name:${u.name}, age:${u.age}`)
});

app.delete('/deleteUser/:id',(req,res)=>{
    const u = users.find(u=> u.id==req.params.id);
    if(!u)res.status(404).send(`user not found`);
    const index = users.indexOf(u);
    users.splice(index,1);
    res.send(`user deleted successfully, name:${u.name}, age:${u.age}`)
});
app.listen(port,()=>{
    console.log(`App listening on the port http://localhost:${port}`)
})