// functions in javascript

function greet(name) {
    return "Hello, " + name + "!";
}

console.log(greet("Alice"));
console.log(greet("Bob"));

// Function with default parameters
function greetWithDefault(name = "Guest") {
    return "Hello, " + name + "!";
}

console.log(greetWithDefault());
console.log(greetWithDefault("Charlie"));

// Function with rest parameters
function sum(...numbers) {
    return numbers.reduce((total, num) => total + num, 0);
}

console.log(sum(1, 2, 3));
console.log(sum(4, 5, 6, 7));

// Function with arrow syntax
const greetArrow = (name) => {
    return "Hello, " + name + "!";
};

console.log(greetArrow("Dave"));
const sumArrow = (...numbers) => {
    return numbers.reduce((total, num) => total + num, 0);
};

console.log(sumArrow(8, 9, 10));
