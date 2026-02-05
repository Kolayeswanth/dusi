# Count occurrences of a character

def count_character(s, char):
    count = 0
    for c in s:
        if c == char:
            count += 1
    return count

String = "Hello, World!"
Character = 'o'
Occurrences = count_character(String, Character)
print(f'The character "{Character}" occurs {Occurrences} times in the string "{String}".')