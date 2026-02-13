// login using jwt token
const express = require("express");
const app = express();
const port = 3000;
app.use(express.json());
const jwt = require("jsonwebtoken");
const bodyParser = require("body-parser");
const { userRoutes } = require("./routes/routes");

app.use(bodyParser.json());
app.use("/api/users", userRoutes);