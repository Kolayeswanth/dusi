# count no of vowels in a string

def count_vowels(s):
    vowels = 'aeiouAEIOU'
    count = 0
    for char in s:
        if char in vowels:
            count += 1
    return count

String = "Hello, World!"
Vowel_Count = count_vowels(String)
print("String:", String)
print("Number of Vowels:", Vowel_Count)