#  Remove spaces from both sides

def remove_spaces(s):
    return s.strip()

String = "   Hello, World!   "
Trimmed_String = remove_spaces(String)
print("Original String:", f'"{String}"')
print("Trimmed String:", f'"{Trimmed_String}"')