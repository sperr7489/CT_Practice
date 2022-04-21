
# 입력받은 좌표에 따라서 먼저 리스트를 만든다.


from typing import List


t = input()  # 테스트케이스의 갯수


def num_is_bugs() -> int:
    # 가로길이, 세로길이, 배추의 갯수를 입력받는다

    col, row, vegi_num = map(int, input().split())

    farm = [[0]*col for _ in range(row)]  # 리스트 초기화 row * col의 배열
    print(farm)
    # 가로길이는 사실상 col의 갯수, 세로 길이는 row의 갯수가 된다.
    for i in range(vegi_num):
        x, y = map(int, input().split())  # 인풋 맏은 것을 int형태로 입력받는다.
        # x와 y좌표를 입력받는다.
        farm[y][x] = 1
        # 여기까지가 농장의 배추가 심어진 위치를 알려준것이라고 할 수 있다.

    def dfs(i, j):
        # 더 이상 땅이 아닌 경우 종료
        if i < 0 or i >= len(farm) or \
            j < 0 or j >= len(farm[0]) or \
                farm[j][i] != 1:
            return

        farm[i][j] = 0  # def함수는 중첩함수이기 때문에 부모 함수의 변수를 맘대로
        # 쓸 수 있기 때문에 farm 변수를 맘대로 가져올 수 있다.
        dfs(j+1, i)
        dfs(j-1, i)
        dfs(j, i+1)
        dfs(j, i-1)

    count = 0
    for i in range(len(farm)):
        for j in range(len(farm[0])):
            if farm[i][j] == 1:
                dfs(i, j)
                # 모든 육지 탐색 후 카운트 1 증가
                count += 1

    print(count)


for t in range(int(t)):
    num_is_bugs()
