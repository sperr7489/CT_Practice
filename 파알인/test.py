# str = "abcd"

# # print(str[4])

# str = "abcd"

# print(str[0:4])
c = 'BlockDMask'
d = 'BlWqckDMaskdd'
print(min(c, d))  # 반환 : 'B'

# s로 해당 문자열이 도달한다.


"""
    s = 12343112
    
    343-> 23431로 움직였을텐데 그러면 다시 그전 343이 최대였으니 그것을 반환해야만 한다. 
    이때 left==2 right==4 에서 left==1 right ==5 로 바뀐상황인데 
    343을 출력해주려면 슬라이싱을 다음과 같이 처리해야만 한다. 
    s[left+1, right] 
    right는 왜 1을 다시 빼주지 않는가 하면 슬라이싱과 인덱스로 직접 조회하는 것은 다르기 때문이다. 
    s[1:3] 과 s[3]에서 둘의 3이 다른 의미를 지닌다. 이 정돈 알아야지~!
"""


def longestPalindrome(self, s: str) -> str:
    # expand는 팰린드롬 판별 및 투 포인터 확장
    def expand(left: int, right: int) -> str:
        while left >= 0 and right < len(s) and s[left] == s[right]:
            left -= 1
            right += 1

        # while문이 끝나고 return 을 한다. while 문 언제 끝나는데?
        """
            1. left가 0보다 작음
            2. right가 문자열 s의 길이보다 길때
            3. s[left]와 s[right]가 같지 않을 때 -> 같지 않게 되면 더이상 비교할 필요가 없으니까.
        """
        """
            위의 반복문을 만족하지 않을 때 반복문을 빠져나오게 될텐데 그 때의 의미는
            left-=1, right +=1을 하고 났더니 조건에 만족하지 않았기때문이다. 
            그래서 다음 리턴값은 마지막에 했던 문자열을 슬라이싱하여 잘라준것이다. 
        """
        return s[left+1:right]

    if len(s) < 2 or s == s[::-1]:
        return s
    result = ''

    for i in range(len(s)-1):
        # 짝수와 홀수의 투포인터를 모두 따지려고 한다.
        # 반복문을 돌면서 result가 계속해서 갱신되겠지
        result = max(result, expand(i, i+1), expand(i, i+2), key=len)
    return result
