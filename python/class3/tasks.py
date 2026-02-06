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
# students = {}
# for i in range(3):
#     print("enter student name and marks:",end=" ")
#     values = input()
#     name,marks = values.split()
#     students[name] = marks

# print(students) 

# Remove duplicates from a list using a set.
list = [2,2,3,3,2,3,2,12,3,45,6,6,7]
unique = set(list)
print(unique)

# Sort a list of strings alphabetically without using sorted().
string = ["banana", "apple", "cherry", "date"]
for i in range(len(string)):
    for j in range(i+1,len(string)):
        if string[i] > string[j]:
            string[i] , string[j] = string[j], string[i]
print(string)

# Given a string "PYTHON PROGRAMMING", find the number of vowels.

def findVowels(str):
    vowels = "aeiouAEIOU"
    count = 0
    for chr in str:
        if chr in vowels:
            count+=1
    return count

word = "PYTHON PROGRAMMING"
count = findVowels(word)
print(count)

# Check if a string contains only digits using .isdigit().
def checkDigits(str):
    for char in str:
        try:
            int(char)
        except Exception:
            return 0
    return 1

word1 = "1223334"
word2 = "12Aeio"

if(checkDigits(word1)):
    print("All are digits")
if(checkDigits(word2)):
    print("All are digits")

# Convert a list: [1, 2, 3, 4] to string "1234" without using join().
list = [1,2,3,4]
string =''
for char in list:
    char = str(char)
    string += char
print(string)

# Convert a string "12345" into a list of integers [1,2,3,4,5].
list =[]
string = "12345"
for char in string:
    number = int(char)
    list.append(number)

print(list)

# Take a string "Hello123" and separate alphabets & numbers.
word = "Hello123"
alphabets = ""
numbers = ""

for char in word:
    try:
        int(char)
        numbers += char
    except Exception:
        alphabets += char
print("Alphabets: ", alphabets)
print("Numbers: ", numbers)

# Reverse a tuple without converting into a list.
tuples = (1,2,3,2,3,3)
tuples = tuples[::-1]
print(tuples)

# Create a list of 10 numbers and find min, max & sum without using built-in functions.
import math
list = [1,2,3,4,5,6,7,8,9,10]
min = math.inf
max = -math.inf
for i in list:
    if i > max:
        max = i
    if i < min:
        min = i
print(min,max)

# Count how many times each character appears in "banana".
counter = {}
word = "banana"
for char in word:
    if char not in counter:
        counter[char] = 1
    else:
        counter[char] += 1
print(counter)

# Convert a nested list into a single flat list.
