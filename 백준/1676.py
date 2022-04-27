num = int(input())
count=0
def factorialZero(num : int):
    global count
    # def fiveCheck(val : int):
    #     if val % 5==0: 
    #         count+=1
    num+=1
    for i in range(1,num):
        while(i%5==0):
            count+=1
            i/=5

factorialZero(num)
print(count)
