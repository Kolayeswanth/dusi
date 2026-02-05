# replace spaces with hyphens

def replace_spaces_with_hyphens(s):
    return s.replace(" ", "-")

String = "Hello World! This is a test."
Modified_String = replace_spaces_with_hyphens(String)
print("Original String:", String)
print("Modified String:", Modified_String)