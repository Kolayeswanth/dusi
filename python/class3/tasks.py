# Create a list of 5 numbers. Print the first, last, and middle element.
numbers = [10, 20, 30, 40, 50]
print(numbers[0],'',numbers[-1],'', numbers[len(numbers)//2])  # Output: 10

# Convert a tuple to a list, append a value, and convert it back.
my_tuple = (1,2,3)
result_list = list(my_tuple)
result_list.append(4)
my_tuple = tuple(result_list)
print(my_tuple)

# Given data = {"name": "Allen", "age": 25}, print all keys and values
information = {"name":"Allen", "age":"25"}
for key in information:
    print(key,':',information[key])

# Create a dictionary to store 3 students’ names and marks. Print the average marks.
students = {}
for i in range(3):
    print("enter student name and marks:",end=" ")
    values = input()
    name,marks = values.split()
    students[name] = marks

print(students) 

# Remove duplicates from a list using a set.
list = [2,2,3,3,2,3,2,12,3,45,6,6,7]
unique = set(list)
print(unique)