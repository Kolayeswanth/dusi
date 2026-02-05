#list demonstration

fruits = ["apple", "banana", "cherry"]
fruits[1] = "blueberry"
print(fruits)  # Output: ['apple', 'blueberry', 'cherry']
print(type(fruits))  # Output: <class 'list'>
fruits.append("date")
print(fruits)  # Output: ['apple', 'blueberry', 'cherry', 'date']
fruits.remove("apple")
print(fruits)  # Output: ['blueberry', 'cherry', 'date']
fruits.pop()
print(fruits)  # Output: ['blueberry', 'cherry']
fruits.insert(1, "kiwi")
print(fruits)  # Output: ['blueberry', 'kiwi', 'cherry']
fruits.sort()
print(fruits)  # Output: ['blueberry', 'cherry', 'kiwi']
fruits.reverse()
print(fruits)  # Output: ['kiwi', 'cherry', 'blueberry']
print(len(fruits))  # Output: 3 
print("grape" in fruits)  # Output: False