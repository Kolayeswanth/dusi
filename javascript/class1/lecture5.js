// Array in javaScript

// 1. Array is a data structure that can hold multiple values of the same type.
// 2. Array is a collection of elements that are stored in contiguous memory locations.
// 3. Array is a data structure that can hold multiple values of different types.

// Creating an array
let arr = [1, 2, 3, 4, 5];

// Accessing elements of an array
console.log(arr[0]);
console.log(arr[1]);
console.log(arr[2]);
console.log(arr[3]);
console.log(arr[4]);

// Modifying elements of an array
arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40;
arr[4] = 50;

console.log(arr);

// Array methods
console.log("Length of array: " + arr.length);
console.log("Index of element 30: " + arr.indexOf(30));
console.log("Is element 40 in array? " + arr.includes(40));
console.log("Array to string: " + arr.toString());
console.log("Array joined with '-': " + arr.join("-"));

// Adding elements to an array
arr.push(60);
console.log(arr);

// Removing elements from an array
arr.pop();
console.log(arr);

arr.shift();
console.log(arr);

arr.unshift(0);
console.log(arr);

// Slicing an array
let slicedArr = arr.slice(1, 4);
console.log(slicedArr);

// Splicing an array
arr.splice(2, 2, 25, 35);
console.log(arr);

// Concatenating arrays
let arr2 = [6, 7, 8];
let concatenatedArr = arr.concat(arr2);
console.log(concatenatedArr);

// Sorting an array
concatenatedArr.sort();
console.log(concatenatedArr);

concatenatedArr.sort((a, b) => a - b);
console.log(concatenatedArr);

// Reversing an array
concatenatedArr.reverse();
console.log(concatenatedArr);

// Multidimensional arrays
let matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

console.log(matrix[0][0]);
console.log(matrix[1][1]);
console.log(matrix[2][2]);