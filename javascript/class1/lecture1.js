// Lecture 1: Introduction to JavaScript
// This lecture covers the basics of JavaScript, including variables, data types, and console output.


console.log("Hello, World! This is Lecture 1 of Class 1.");

var v1 =10;
console.log("The value of v1 is: " + v1);
console.log("type of v1 is: " + typeof v1);

var v2 = "Hello";
console.log("The value of v2 is: " + v2);
console.log("type of v2 is: " + typeof v2);

var v3 = true;
console.log("The value of v3 is: " + v3);
console.log("type of v3 is: " + typeof v3);

var v4;
console.log("The value of v4 is: " + v4);
console.log("type of v4 is: " + typeof v4);

var v5 = null;
console.log("The value of v5 is: " + v5);
console.log("type of v5 is: " + typeof v5);

var v6 = {name: "Alice", age: 30};
console.log("The value of v6 is: " + JSON.stringify(v6));
console.log("type of v6 is: " + typeof v6);

var v7 = [1, 2, 3, 4, 5];
console.log("The value of v7 is: " + JSON.stringify(v7));
console.log("type of v7 is: " + typeof v7);

var v8 = function() { return "Hello from v8!"; };
console.log("The value of v8 is: " + v8());
console.log("type of v8 is: " + typeof v8); 

console.log(`v1 = ${v1}`);