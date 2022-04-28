a,b = map(int, input().split())   
def retVal(a : int,b: int)->int:
    if(a>b): 
        return 1
    elif(a<b):
        return -1
    else:
        return 0
result = {1:">",0:"==",-1:"<"}
print(result[retVal(a,b)])