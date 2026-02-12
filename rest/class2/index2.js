const express = require('express');
const app = express();
const port = 3000;

app.use(express.json());

const users = [
    {id:1,name:"yeswanth",mobile:1234567890,age:21},
    {id:2,name:"Dinesh",mobile:9876543210,age:20}
]

// Routes 
app.post('/addUser',(req,res)=>{
    const user = {
        id : users.length+1,
        name : req.body.name,
        mobile : req.body.mobile,
        age : req.body.age
    }
    users.push(user);
    res.send(`User added successfully, id:${user.id}, name:${user.name}, mobile:${user.mobile}, age:${user.age}`);
});

app.get('/findUser/:id',(req,res)=>{
    const u = users.find(u=> u.id==req.params.id);
    if(!u)res.status(404).send(`User not found`);
    res.send(`User found successfully, name:${u.name}, mobile:${u.mobile}, age:${u.age}`);
});

app.get('/getAllUsers',(req,res)=>{
    res.send(users);
});

app.put('/updateUser/:id',(req,res)=>{
    const u = users.find(u=> u.id==req.params.id);
    if(!u)res.status(404).send(`User not found`);
    u.name = req.body.name ? req.body.name : u.name;
    u.mobile = req.body.mobile ? req.body.mobile : u.mobile;
    u.age = req.body.age ? req.body.age : u.age;
    res.send(`User updated successfully, name:${u.name}, mobile:${u.mobile}, age:${u.age}`);
});

app.delete('/deleteUser/:id',(req,res)=>{
    const u = users.find(u=> u.id==req.params.id);
    if(!u)res.status(404).send(`User not found`);
    const index = users.indexOf(u);
    users.splice(index,1);
    res.send(`User deleted successfully, name:${u.name}, mobile:${u.mobile}, age:${u.age}`);
});

app.listen(port,()=>{
    console.log(`App listening on the port http://localhost:${port}`);
}); 