#dictionary demonstration

student = {'name': 'Alice', 'age': 21, 'courses': ['Math', 'CompSci']}
print(type(student))  # Output: <class 'dict'>
print(student['name'])  # Output: Alice
print(student.get('age'))  # Output: 21

student['age'] = 22 
print(student['age'])  # Output: 22
student['grade'] = 'A'
print(student)  # Output: {'name': 'Alice', 'age': 22, 'courses': ['Math', 'CompSci'], 'grade': 'A'}
del student['grade']
print(student)  # Output: {'name': 'Alice', 'age': 22, 'courses': ['Math', 'CompSci']}
print(len(student))  # Output: 3