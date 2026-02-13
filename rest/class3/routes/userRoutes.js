// routes
const express = require("express");
const router = express.Router();
const { registerUser, loginUser, profile } = require("../controllers/userController");
const { verifyToken } = require("../auth/verify_token");

// Register route
router.post("/register", registerUser);

// Login route
router.post("/login", loginUser);

router.get("/profile", verifyToken, profile);

module.exports = {
  userRoutes: router,
};