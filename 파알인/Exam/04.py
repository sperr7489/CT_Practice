import re


paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
banned = ["hit"]


array = paragraph.split()
print(array)
# compare_list = []

# for char in array:
#     # char = ''.join(filter(str.isalnum, char))
#     char = "".join(filter(lambda x: x.isalnum(), char))

#     compare_list.append(char.lower())  # 전부 lower로 바꾸어준다.

# print(compare_list)

# max_str = ""

# flag = 0

# for char in compare_list:
#     idx = 0
#     if char in banned:
#         continue
#     for tmp_char in compare_list:
#         if char == tmp_char:
#             idx += 1
#     if flag < idx:
#         flag = idx
#         max_str = char

words = [word for word in re.sub(
    r'[ ^\w]', '', paragraph).lower().split() if word not in banned]
print(words)

a = ['cde', 'cfc', 'abc']
b = sorted(a, key=lambda s: (s[0], s[-1]))
print(b)
