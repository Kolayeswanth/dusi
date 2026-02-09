// data and time in JavaScript

var d = new Date();
console.log("Current date and time: " + d);
console.log("Current year: " + d.getFullYear());
console.log("Current month (0-11): " + d.getMonth());
console.log("Current date: " + d.getDate());
console.log("Current day of week (0-6): " + d.getDay());
console.log("Current hours: " + d.getHours());
console.log("Current minutes: " + d.getMinutes());
console.log("Current seconds: " + d.getSeconds());
console.log("Current milliseconds: " + d.getMilliseconds());
console.log("To local time string: "+ d.toLocaleTimeString());
console.log("To date string: " + d.toDateString());
console.log("To ISO string: " + d.toISOString());

var d2 = new Date("2024-01-01");
console.log("Date for January 1, 2024: " + d2);
console.log("Time difference between now and January 1, 2024 (ms): " + (d2 - d));