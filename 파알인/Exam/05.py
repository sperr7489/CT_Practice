# # 먼저 각 단어들을 하나하나 검사해보는 것을 먼저 해보도록 하자.
# from tracemalloc import start


# strs = ["eat", "tea", "tan", "ate", "nat", "bat"]

# sort_strs = []

# for i, str in enumerate(strs):
#     sort_strs.append(''.join(sorted(str)))

# flag = len(strs)
# result = []
# for i in range(len(strs)):
#     if sort_strs[i] == "null":
#         continue
#     if flag == 0:
#         # flag가 0이라는건 처리가 끝났다는 뜻.
#         break
#     temp = []
#     for k in range(i+1, len(strs)):
#         if sort_strs[i] == sort_strs[k]:
#             temp.append(strs[k])
#             sort_strs[k] = 'null'
#             flag -= 1
#         # if first_str == second_str:

#         # 만약 두개의 문자열이 같다면
#         # temp.append(strs[k])5
#         # sort_strs[k] = "null"  # null값으로 바꾸고 해당되는건 바로 패스 하도록 한다.
#         # if i == k:
#         #     flag -= 1
#     temp.insert(0, strs[i])
#     temp.sort()
#     result.append(temp)
#     flag -= 1
# print(result)


import collections
from typing import Collection


s = [('yellow', 1), ('blue', 2), ('yellow', 3), ('blue', 4), ('red', 1)]
d = collections.defaultdict(list)
for k, v in s:
    print(v)
    d[k].append(v)
print((d.items()))
