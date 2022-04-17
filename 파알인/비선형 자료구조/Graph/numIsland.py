"""
중첩 함수란 함수 내에 위치한 또 다른 함수로, 바깥에 위치한 함수들과 달리 부모함수의 변수를
자유롭게 읽을 수 있다는 장점이 있다. 
"""

from typing import List


def numIslands(self, grid: List[List[str]]) -> int:
    def dfs(i, j):
        # 더 이상 땅이 아닌 경우 종료
        if i < 0 or i >= len(grid) or \
            j < 0 or j >= len(grid[0]) or \
                grid[i][j] != '1':
            return

        grid[i][j] = 0  # def함수는 중첩함수이기 때문에 부모 함수의 변수를 맘대로
        # 쓸 수 있기 때문에 grid 변수를 맘대로 가져올 수 있다.

        dfs(i+1, j)
        dfs(i-1, j)
        dfs(i, j+1)
        dfs(i, j-1)

    count = 0
    for i in range(len(grid)):
        for j in range(len(grid[0])):
            if grid[i][j] == '1':
                dfs(i, j)
                # 모든 육지 탐색 후 카운트 1 증가
                count += 1

    return count
