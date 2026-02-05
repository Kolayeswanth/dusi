# convert a sentence to title case
def title_case(sentence):
    return sentence.title()

Sentence = "hello, world! this is a title case example."
Title_Cased_Sentence = title_case(Sentence)
print("Original Sentence:", Sentence)
print("Title Cased Sentence:", Title_Cased_Sentence)