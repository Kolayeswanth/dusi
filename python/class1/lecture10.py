#functions demonstration
# function is a block that performs a specific task

def greet(name):
    """This function greets the person whose name is passed as argument"""
    print("Hello, " + name + "!")
def add_numbers(n1, n2):
    """This function returns the sum of two numbers"""
    return n1 + n2
def multiply_numbers(n1, n2):
    """This function returns the product of two numbers"""
    return n1 * n2

def greet(name="Guest"):
    """This function greets the person whose name is passed as argument"""
    print("Hello, " + name + "!")

def numbers(n1, n2):
    """This function returns the sum and difference of two numbers"""
    return n1 + n2, n1 - n2
# calling the functions
greet()
name = input("Enter your name: ")
greet(name) 
n1 = int(input("Enter first number: "))
n2 = int(input("Enter second number: "))
sum = add_numbers(n1, n2)
print("The sum is: " + str(sum))
product = multiply_numbers(n1, n2)
print("The product is: " + str(product))

# can return more than one value                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
sum, difference = numbers(n1, n2)
print("The sum is: " + str(sum))
print("The difference is: " + str(difference))
