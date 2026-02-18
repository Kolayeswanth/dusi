const logger = require('./logger');
const morgan = require('morgan');
const express = require('express');

const app = express();
const PORT = 3000;

// Use morgan middleware for logging HTTP requests
app.use(morgan('combined', {
    stream: {
        write: (message) => logger.info(message.trim())
    }
}));

app.get('/', (req, res) => {
    res.send('Hello, World!');
});

app.listen(PORT, () => {
    logger.info(`Server is running on port ${PORT}`);
});