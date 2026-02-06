# modules 

import math

def area_of_circle(radius):
    return math.pi * math.pow(radius, 2)

area = area_of_circle(5)
print(area)

import random
random_number = random.randint(1, 100)
print(random.choice(['apple', 'banana', 'cherry']))  # Randomly selects one of the fruits
print(random_number)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                

from datetime import datetime
now = datetime.now()
print("Current date and time:", now)

import module
print(module.add(5, 3))  # Output: 8
print(module.subtract(5, 3))  # Output: 2
print(module.multiply(5, 3))  # Output: 15
try:
    print(module.divide(5, 0))  # This will raise an exception
except ValueError as e:
    print("Caught an exception:", e)