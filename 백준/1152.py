
string = input()
def numOfWords(strTest:str):
    print(len(strTest.strip(" ").split()))
numOfWords(string)