// json object in javascript

let student = {
    name: "John Doe",
    age: 20,
    isEnrolled: true,
    courses: ["Math", "Science", "History"],
    address: {
        street: "123 Main St",
        city: "Anytown",
        state: "CA",
        zip: "12345"
    }
};

console.log(student);
console.log(student.name);
console.log(student.age);
console.log(student.isEnrolled);
console.log(student.courses);
console.log(student.address);

// Modifying properties of an object
student.name = "Jane Doe";
student.age = 21;
student.isEnrolled = false;
student.courses.push("English");
student.address.city = "Othertown";

console.log(student);

// Deleting a property from an object
delete student.isEnrolled;
console.log(student);

// Checking if a property exists in an object
console.log("name" in student);
console.log("isEnrolled" in student);

// Iterating over properties of an object
for (let key in student) {
    console.log(key + ": " + student[key]);
}

for(let key of Object.keys(student)) {
    console.log(key + ": " + student[key]);
}

for(let value of Object.values(student)) {
    console.log(value);
}

for(let [key, value] of Object.entries(student)) {
    console.log(key + ": " + value);
}

var employees = [
    {
        name: "Alice",
        age: 30,
        department: "HR"
    },
    {
        name: "Bob",
        age: 25,
        department: "Engineering"
    },
    {
        name: "Charlie",
        age: 35,
        department: "Sales"
    }
];

console.log(employees);     

for(let employee of employees) {
    for(let key in employee) {
        console.log(key + ": " + employee[key]);
    }
    console.log("-----");
}