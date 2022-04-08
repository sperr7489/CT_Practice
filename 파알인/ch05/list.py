a = list()

a = [1, 2, 3]
a.append(4)
print(a)
# [1,2,3,4] 로 출력된다.

a.insert(3, 5)
print(a)
# [1, 2, 3, 5, 4]로 출력된다.

a = [1, 2, 3, 4, 5, 6]
del a[1]
print(a)
