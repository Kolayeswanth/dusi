const express = require("express");
const jwt = require("jsonwebtoken");
const bodyParser = require("body-parser");

const SECRET_KEY = "HELLO!@$`";

function verifyToken(req, res, next) {
    const token = req.headers["authorization"];
    if (!token) {
        res.status(401).json({ message: "No token provided" });
        return;
    }
    
    jwt.verify(token, SECRET_KEY, (err, decoded) => {
        if (err) {
            res.status(401).json({ message: "Invalid token" });
            return;
        }
        req.user = decoded;
        next();
    });
}

module.exports = {
    verifyToken,
    SECRET_KEY,
};