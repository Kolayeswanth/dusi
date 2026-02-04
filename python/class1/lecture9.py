# input demonstration

name = input("Enter your name: ")
print("Hello, "+name+"!")

n1 = input("Enter first number: ") # by default input is string
n2 = input("Enter second number: ") # by default input is string
sum = int(n1) + int(n2) # type conversion from string to int
print("The sum is: "+str(sum))

n1 = int(input("Enter first number: ")) # direct conversion from string to int
n2 = int(input("Enter second number: ")) # direct conversion from string to int
sum = n1 + n2
print("The sum is: "+str(sum))

n1 , n2 = map(int, input("Enter two numbers separated by space: ").split())
sum = n1 + n2
print("The sum is: "+str(sum))