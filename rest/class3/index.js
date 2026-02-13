const express = require("express");
const app = express();
const port = 3000;
const {userRoutes} = require("./routes/userRoutes");

// Middleware to parse JSON bodies
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

// End Points
app.use("/api/users", userRoutes);

// port 
app.listen(port, () => {
  console.log(`Example app listening on port http://localhost:${port}`);
});