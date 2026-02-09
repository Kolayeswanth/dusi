// This code will throw an error because 'i' is not defined outside the for loop
// let is used to define local variables that are block-scoped, meaning they are only accessible within the block they are defined in (in this case, the for loop).
// var is used to define variables that are function-scoped, meaning they are accessible throughout the entire function they are defined in (or globally if defined outside any function).
// loops in JavaScript


var i = 10;
for(let i = 0; i < 10; i++) 
    console.log("Iteration: " + i);
console.log(i);

while(i < 20) {
    console.log("While loop iteration: " + i);
    i++;
}

do {
    console.log("Do-while loop iteration: " + i);
    i++;
} while(i < 25);

let fruits = ["apple", "banana", "cherry"];
for(let fruit in fruits) {
    console.log("Fruit: " + fruits[fruit]);
}

for(let fruit of fruits) {
    console.log("Fruit: " + fruit);
}
