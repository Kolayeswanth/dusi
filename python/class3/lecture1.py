# Python run and debug is explained in this class.


colors = ["red", "green", "blue", "yellow", "purple"]

colors = tuple(x for x in colors if x != "yellow")

print(colors)

result =("red", "green", "blue", "purple"
         )
for x in colors:
    if x!= "yellow":
        result += (x,)

