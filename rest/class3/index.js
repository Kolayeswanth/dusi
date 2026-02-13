const express = require("express");
const app = express();
const port = 3000;
app.use(express.json());
const jwt = requore("jsonwebtoken");
const bodyParser = require("body-parser");
const {userRoutes} = require("./routes/userRoutes");

app.use(bodyParser.json());
app.use("/api/users", userRoutes);

// port 
app.listen(port, () => {
  console.log(`Example app listening on port http://localhost:${port}`);
});

// End Points
