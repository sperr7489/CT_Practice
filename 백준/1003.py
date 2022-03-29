from ast import List
import collections
from itertools import count


test_case = 4


# def fibonacci(n: int) -> int:
#     if n == 0:
#         print(0)
#         return 0
#     elif n == 1:
#         print(1)
#         return 1
#     else:
#         return fibonacci(n-1) + fibonacci(n-2)


def fibonacci_array(n: int) -> list[int]:
    if n == 0:
        # print(0)
        return [0]
    elif n == 1:
        # print(1)
        return [1]
    else:
        return fibonacci_array(n-1) + fibonacci_array(n-2)


# print(fibonacci_array(22))

# fibonacci_array의 리턴이 배열로 제시된다. 얘를들어 [1,]

def fibonacci_print(n: int):
    counts = collections.defaultdict(int)
    for i in fibonacci_array(n):
        counts[i] += 1
    print(counts[0], end=" ")
    print(counts[1])


def print_result(t: int, n: list[int]):
