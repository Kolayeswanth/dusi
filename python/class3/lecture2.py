# Exception handling in Python

try:
    int("abc")
except ValueError as e:
    print("ValueError occurred:", e)

# else will execute if no exception occurs
try:
    result = 10 / 2
except ZeroDivisionError as e:
    print("ZeroDivisionError occurred:", e)
else:
    print("Result is:", int(result))
finally:
    print("This will always execute.")

# raise an exception to throw an exception
def divide(a, b):
    if b == 0:
        raise ValueError("Cannot divide by zero")
    return a / b  
try:
    divide(10, 0)
except ValueError as e:
    print("Caught an exception:", e)