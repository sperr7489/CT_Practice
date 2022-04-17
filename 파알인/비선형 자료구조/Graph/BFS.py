"""
    BFS를 반복 구조로 구현할 때는 큐를 이용한다. 
    BFS는 재귀를 사용할 수 없고 큐를 이용해 구현한다는 사실을 명심하자.
"""
graph = {
    1: [2, 3, 4],
    2: [5],
    3: [5],
    4: [8],
    5: [6, 7],
    6: [],
    7: [3],
    8: []
}


def iterative_bfs(start_v):
    discovered = [start_v]  # 첫번째 start 하는 정점은 당연히 discovered에 들어가겠지
    queue = [start_v]

    while queue:
        v = queue.pop(0)  # Pop(0) 이라는 부분에서 DFS와 다르다.
        for w in graph[v]:
            """
            DFS는 해당 정점에 대해서 리프노드가 discovered에 먼저 검사하는 반면
            BFS는 해당 부모노드의 자식 노드들이 discoveredd에 포함되어 있는지를 검사하는 부분이 다름을
            명심하자. 
            """
            if w not in discovered:
                discovered.append(w)
                queue.append(w)
    return discovered


print(iterative_bfs(1))
