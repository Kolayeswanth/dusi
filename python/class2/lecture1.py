# simple for loop(over a list / sequence
fruits = ["apple", "banana", "cherry"]
for fruit in fruits:
    print(fruit)

# for loop with range
for i in range(5):
    print(i,end=" ")  # print numbers from 0 to 4 on the same line

# for loop with range and step
for i in range(0, 10, 2):
    print(i,end=" ")  # print even numbers from 0 to 8 on the same line
print()
# loop with string
for char in "Hello":
    print(char)

# loop with dictionary
person = {"name": "Alice", "age": 30, "city": "New York"}
for key in person: # itterating with key only
    print(key, ":", person[key])
for value in person.values():
    print(value)
for key, value in person.items(): # itterating with key and value
    print(key, "->", value)


# nested for loop
for i in range(5):
    for j in range(5):
        print("outter itteration: ", i, "inner itteration: ",j)

# for loop with enumerate()
names1 = ['a', 'b', 'c']
names2 = ['a', 'd', 'e']
names = zip(names1,names2) # zip method combines multiple itterables
for i,j in enumerate(names):
    print('i:',i,'j:',j)

# for loop with else
for i in range(3):
    print(i)
else:
    print("loop completed") # else will execute only when loop was completed without any breaks

for i in range(3):
    if i == 1:
        break
    print(i)
else:
    print("loop completed")

# shortcut for loop 
squares = [x*x for x in range(5)]
print(squares)

# while loop 
i = 1
while i <= 5:
    print(i)
    i += 1