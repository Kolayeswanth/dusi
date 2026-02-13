// login using jwt token
const express = require("express");
const jwt = require("jsonwebtoken");
const { SECRET_KEY } = require("../auth/verify_token");

const users = [
    {id: 1, username: "user1", password: "pass1"},
    {id: 2, username: "user2", password: "pass2"},
];


function registerUser(req, res) {
    const { username, password } = req.body;
    
    // Validate input
    if (!username || !password) {
        return res.status(400).json({ message: "Username and password are required" });
    }
    
    // Check if user already exists
    const existingUser = users.find(u => u.username === username);
    if (existingUser) {
        return res.status(400).json({ message: "User already exists" });
    }

    // Create new user
    const newUser = {
        id: users.length + 1,
        username,
        password
    };
    users.push(newUser);

    const token = jwt.sign(
        { id: newUser.id, username: newUser.username },
        SECRET_KEY,
        { expiresIn: "1h" }
    );
    res.status(201).json({ message: "User registered successfully", token });
}

function loginUser(req, res) {
    const { username, password } = req.body;
    
    // Validate input
    if (!username || !password) {
        return res.status(400).json({ message: "Username and password are required" });
    }
    
    const user = users.find(u => u.username === username && u.password === password);
    if (!user) {
        return res.status(400).json({ message: "Invalid credentials" });
    }
    
    const token = jwt.sign(
        { id: user.id, username: user.username },
        SECRET_KEY,
        { expiresIn: "1h" }
    );
    res.status(200).json({ message: "Login successful", token });
}   



function profile(req, res) {
    res.status(200).json({ message: "This is the profile page", user: req.user });
}

module.exports = {
    registerUser,
    loginUser,
    profile,
};
