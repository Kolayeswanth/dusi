// functions in javascript

function greet(name = "Guest"){
    console.log("Hello, " + name + "!");
}
greet("Alice");
greet();

// arrow function
// const functionName = (parameters) => { function body }
const add = (a,b) => a+b;
console.log(add(5, 3));

// function with rest parameters
function sum(...numbers) {
    return numbers.reduce((total, num) => total + num, 0);
}
console.log(sum(1, 2, 3));
console.log(sum(4, 5, 6, 7));

const multiply = (a,b) => {
    let result = a * b;
    console.log("inside multiply function");
    return result;    
}
console.log(multiply(4, 5));

numbers = [1, 2, 3, 4, 5];
const squaredNumbers = numbers.map(num => num * num);
console.log(squaredNumbers);

fruits = ["apple", "banana", "cherry"];
fruits.forEach(fruit => console.log(fruit.toUpperCase()));