import collections
def countStrNum(input: str ) -> str:
    # print(sorted(list( input.upper())))
    counter = collections.Counter(input.upper())
    max_count=-1
    max_letter = "?"
    for letter in counter:
        if (counter[letter]>max_count): 
            max_count = counter[letter]
            max_letter = letter
        elif counter[letter]==max_count: # 여러개 있다는 것.
            max_letter ="?"
    return max_letter
    # print(list(filter(ord,list( input.upper()))))
print(countStrNum("Mississipi"))