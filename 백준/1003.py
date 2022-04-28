# fibo(n)의 0의 갯수 = fibo(n-2)의 0의 갯수 + fibo(n-1)의 0의 갯수
# fibo(n)의 1의 갯수 = fibo(n-2)의 1의 갯수 + fibo(n-1)의 1의 갯수

# 결과값을 하나씩 저장하여 이에 해당하는 딕셔너리의 key값을 찾아가도록 하는 방식

t =int(input())

result ={ 0: [1,0],1:[0,1],2:[1,1]}
# 키가 있는 지 우선적으로 검사한다. 
def keyCheck(n :int):
    if n in result:
        return True
    else:
        return False

def fibo_count(n: int)->bool:
    if keyCheck(n):
        return True
    if keyCheck(n-2) and keyCheck(n-1):
        # n의 result 값이 존재할 경우 
        result[n]=result[n-2][0]+result[n-1][0],result[n-2][1]+result[n-1][1]
        return True
    if not keyCheck(n-2):
        # n-2의 키가 없을 경우?
        fibo_count(n-2)
    if not keyCheck(n-1):  
        fibo_count(n-1)
    fibo_count(n)
for i in range(t):
    n = int(input())
    fibo_count(n) #테스트케이스를 하나씩 받음
    print(result[n][0],result[n][1])
            
            
# 내가 생각한 모범 답안.
for i in range(int(input())):
    a,b=1,0
    for i in range(int(input())): a,b=b,a+b
    print(a,b)
    # 나의 로직을 굉장히 단순하게 표현했다. 
    # 피보나치의 결과값의 1과 0의 갯수가 갖는 규칙을 이렇게 단순하게 표현하다니
    # 굉장히 충격적이다. 