# functions with variable number of arguments
def person_info(**info):
    """This function prints the information of a person passed as keyword arguments"""
    for key, value in info.items():
        print(f"{key}: {value}")

person_info(name="Alice", age=30, city="New York", profession="Engineer")

# lambda function
square = lambda x,y: x*y
print(square(6,5))

# break and continue
for i in range(5):
    if i == 1:
        continue
    print(i)
for i in range(5):
    if i == 2:
        break
    print(i)