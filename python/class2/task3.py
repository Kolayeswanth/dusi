# check weather given string is palindrome or not

def is_palindrome(s):
    cleaned_string = ''.join(s.split()).lower()
    return cleaned_string == cleaned_string[::-1]

String = "A man a plan a canal Panama"
if is_palindrome(String):
    print(f'"{String}" is a palindrome.')
else:
    print(f'"{String}" is not a palindrome.')