"""
    < DFS > 깊이 우선 탐색.
    일반적으로 DFS는 스택으로 구현하며, 재귀를 이용하면 좀 더 간단하게 구현할 수 있다. 
    코테에서도 재귀 구현이 더 선호되는 편이다. 
"""

graph = {
    1: [2, 3, 4],
    2: [5],
    3: [5],
    4: [],
    5: [6, 7],
    6: [],
    7: [3],
}

#  재귀 구조를 이용한 구현


def recursive_dfs(v, discovered=[]):
    discovered.append(v)
    for w in graph[v]:
        """
        graph가 인접리스트로 출발 노드를 키로, 도착 노드를 값으로 나타낸다.
        출발 노드 v에 대해서 도착노드 w가 discovered에 들어 있는지 검사하고 존재 하지 않으면
        해당 노드에 대해서 dfs를 재귀적으로 실행해주는 형식으로 dfs를 표현한다.
        """
        if w not in discovered:  # 가본적 없는 정점이라면?
            discovered = recursive_dfs(w, discovered)  # 해당 정점에서 다시 깊이 탐색 시작
    return discovered


result = recursive_dfs(1)
print(result)

# 스택을 이용한 반복 구조로 표현


def iterative_dfs(start_v):
    discovered = []
    stack = [start_v]
    while stack:
        v = stack.pop()
        if v not in discovered:
            discovered.append(v)
            for w in graph[v]:
                stack.append(w)
    return discovered
