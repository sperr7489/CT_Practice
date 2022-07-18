# 유효한 팰린드롬

# 내가 짠 코드
str = "A man, a plan, a canal: Panama"


def palindrome(input: str) -> bool:

    ret_str = []
    for char in input:
        if char.isalnum():
            ret_str.append(char.lower())
    temp_str = list(reversed(ret_str))
    for i in range(len(ret_str)):
        if (ret_str[i] != temp_str[i]):
            return False
    return True


if(palindrome(str)):
    print("이것이 맞아")
else:
    print("이건 아니지")

# 책에서 제시하는 코드


def isPalindrome(self, s: str) -> bool:
    strs = []
    for char in s:
        if char.isalnum():
            strs.append(char.lower())

    # 팰린드롬 여부 판별
    while len(strs) > 1:
        if strs.pop(0) != strs.pop():
            return False
    return True
    # pop 함수를 통해서 리스트의 반환값을 맨 앞의 값과 맨 뒤의 값을
    # 비교해 나가면서 다른 것이 있다면 False를 반환하는 방식으로 진행한다.
