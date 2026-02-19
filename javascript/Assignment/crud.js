// user management crud operations
const express = require("express");

const app = express();
app.use(express.json());

let users = [
	{ id: 1, name: "Alice" },
	{ id: 2, name: "Bob" }
];

app.get("/users", (req, res) => {
	res.json(users);
});

app.get("/users/:id", (req, res) => {
	const id = Number(req.params.id);
	const user = users.find((item) => item.id === id);

	if (!user) {
		return res.status(404).json({ error: "User not found" });
	}

	return res.json(user);
});

app.post("/users", (req, res) => {
	const { id, name } = req.body;

	if (typeof id !== "number" || typeof name !== "string" || !name.trim()) {
		return res.status(400).json({ error: "Valid id and name are required" });
	}

	if (users.some((item) => item.id === id)) {
		return res.status(409).json({ error: "User id already exists" });
	}

	const newUser = { id, name: name.trim() };
	users.push(newUser);
	return res.status(201).json(newUser);
});

app.put("/users/:id", (req, res) => {
	const id = Number(req.params.id);
	const { name } = req.body;
	const user = users.find((item) => item.id === id);

	if (!user) {
		return res.status(404).json({ error: "User not found" });
	}

	if (typeof name !== "string" || !name.trim()) {
		return res.status(400).json({ error: "Valid name is required" });
	}

	user.name = name.trim();
	return res.json(user);
});

app.delete("/users/:id", (req, res) => {
	const id = Number(req.params.id);
	const index = users.findIndex((item) => item.id === id);

	if (index === -1) {
		return res.status(404).json({ error: "User not found" });
	}

	const removed = users.splice(index, 1)[0];
	return res.json(removed);
});

const port = process.env.PORT || 3000;
app.listen(port, () => {
	console.log(`Server running on port ${port}`);
});
