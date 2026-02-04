# python string handling

text = "python"
print(len(text)) # 6

print(text.upper()) # PYTHON
print(text.lower()) # python
print(text.title()) # Python - capitalizes first letter of each word in the sentence
print(text.capitalize()) # Python - capitalizes first letter of the sentence
text = "  python   "
print(text.strip()) # python - removes leading and trailing whitespace
print(text.lstrip()) # python   - removes leading whitespace
print(text.rstrip()) #   python - removes trailing whitespace
text = "python programming"
print(text.replace("python", "java")) # java programming
print(text.split()) # ['python', 'programming'] - splits by whitespace by default
text = "apple,banana,cherry"
print(text.split(",")) # ['apple', 'banana', 'cherry'] - splits by comma
print(",".join(text.split(","))) # apple,banana,cherry - joins list into string with commas
text = "python programming"
print(text.find("programming")) # 7 - returns starting index of substring
print(text.find("java")) # -1 - substring not found
print(text.index("programming")) # 7 - returns starting index of substring  
print(text.count("a")) # 1 - counts occurrences of substring
print(text.startswith("python")) # True - returns true if string starts with substring
print(text.endswith("programming")) # True - return true if string ends with substring