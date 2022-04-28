# logs = ["dig1 8 1 5 1", "let1 art can", "dig2 3 6",
#         "let2 own kit dig", "let3 art zero"]
# for log in logs:
#     if log.split()[1].isdigi():
#         digits.

from ast import Lambda
from typing import List

logs = ["dig1 8 1 5 1", "let1 art can", "dig2 3 6",
        "let2 own kit dig", "let3 art zero"]


def reorderLogFiles(logs: List[str]) -> List[str]:
    letters, digits = [], []
    for log in logs:

        # print(log)
        # print(log.split()[1].isdigit())

        if log.split()[1].isdigit():
            digits.append(log)
        else:
            letters.append(log)
    # 두개의 키를 람다 표현식으로 정리
    letters.sort(key=lambda x: (x.split()[1:], x.split()[0]))
    # print(letters[0].split()[1:])
    return letters + digits


reorderLogFiles(logs)

array = ["A, 18, 300000", "F, 24, 10000",
         "T, 24, 200000", "Q, 24, 5000000", "B, 70, 5000"]

array.sort(key=lambda x: (x.split()[1:]))
print(array[0].split()[1:])
