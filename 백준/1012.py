
import collections
import readline
import sys
from typing import Collection, List


# t = int(input()) # 테스트 케이스의 갯수
# m = int(input()) # 가로길이  
# n = int(input()) # 세로길이
bug ={}
def cu_neighbor(first, second ): # 인접한 것을 판단하는 함수.
    # List(int)로 받는 이유는 [x좌표, y좌표]를 의미
    # first가 비교되는 들어온 값, second가 비교할 대상.

    if first[0]==second[0]: # x좌표가 같을 때
        if  abs(first[1]-second[1]) == 1:
            # y좌표의 차의 절댓값이 1일 때 인접한다고 할 수 있다. 
            return True
        else:
            return False 
    if first[1]==second[1]:
        if abs(first[0]-second[0]) == 1:
            # x좌표의 차의 절댓값이 1일 때 인접한다고 할 수 있다. 
            return True
        else:
            return False


for i in range(int(input())): # 배추의 갯수 : k
    first = list(map(int,sys.stdin.readline().split())) # 임의의 갯수의 정수를 한 줄에 입력받아 리스트에 저장.
    if i==0 :
        # 첫번째 들어온것.
        bug[1]=[first]
        second = first
        continue
    else:
        # 두번째부터
        if cu_neighbor(first,second):
            # 만약 인접하다면 해당 벌레에 리스트형태로 추가해야겠지?
            for k in bug:
                if second in bug[k]:
                    # bug에 이미 해당 second가 존재한다면?
                    bug[k].append(first)
                    break
        else:
            # 인접하지 않다면?
            length = len(bug.keys())
            bug[length]=[first]
                    
    second= first




print(t)
# bug[1]=[[1,2]]
# bug[2]=[3,4]
# print(bug)
# bug[1].append([6,7])
# for i in bug:
#     print(bug[i])
# print(bug)
a=[1,2] 
print(a)
a= [3,5]
print(a)