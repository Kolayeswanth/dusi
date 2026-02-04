# frozone set demonstration
# immutable once initialized then can't be changed

fs = frozenset([1,2,2,3])
print(fs) # frozenset({1, 2, 3})
print(type(fs)) # <class 'frozenset'>

# None data type
val = None
print(val) # None
print(type(val)) # <class 'NoneType'>