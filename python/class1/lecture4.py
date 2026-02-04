#tuple demonstration

colors = ('red', 'green', 'blue')
print(type(colors))  # Output: <class 'tuple'>
print(colors[0])  # Output: red
print(colors[-1])  # Output: blue
# colors[1] = 'yellow'  # This will raise a TypeError
print(len(colors))  # Output: 3

#range
#range(start, stop, step)
number = range(1, 10, 2)
print(type(number))  # Output: <class 'range'>
print(list(number))  # Output: [1, 3, 5, 7, 9]