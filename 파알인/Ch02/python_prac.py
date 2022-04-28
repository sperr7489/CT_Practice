a:  str = "1"
b:  int = 1


# def fn(a: int) -> bool:
#     # 이런식으로 파라미터의 타입과 리턴값의 타입을 정할 수 있다.


print([n*2 for n in range(1, 10+1) if n % 2 == 1])


# def generator():
#     yield 1
#     yield 'stirng'
#     yield True


# g = generator()
# g

a = [1, 3, 5, 1, 2, 232, 421321, 232]
for i, v in enumerate(a):
    print(i, v)

print('a1', 'b2', sep=',')
print('a1', 'b2')

print([(x, y, z)
       for x in range(5)
       for y in range(5)
       if x != y
       for z in range(5)
       if y != z]
      )
