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
