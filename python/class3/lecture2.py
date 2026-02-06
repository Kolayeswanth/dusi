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