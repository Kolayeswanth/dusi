// logging
const express = require('express');
const logger = require('./logger');

const app = express();
const PORT = 3000;

app.get('/', (req, res) => {
    logger.info('Received a request to the root endpoint');
    res.send('Hello, World!');
});

app.listen(PORT, () => {
    logger.info(`Server is running on port ${PORT}`);
});

