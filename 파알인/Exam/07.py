
# nums = [3, 2, 3]
# # nums = [2, 7, 11, 15]
# # nums = [3, 2, 4]
# target = 6

# sorted_nums = sorted(nums)
# # l = list(filter(lambda x: x <= target, nums))
# # k = list(filter(lambda x: x + l[0] <= target, l))


# result = []
# # print(sorted_nums)


# def plus(a, b, t):
#     if a+b == t:
#         return True


# def sameValueIndex(num: int):
#     n = -1
#     result = []
#     while True:
#         if nums[n+1:].count(num) == 0:
#             break
#         # 중복된게 있는 경우.
#         n += nums[n+1:].index(num) + 1
#         result.append(n)
#     return result


# # 3,2,3 은 2,3,3으로 정렬된다.
# for i in range(len(sorted_nums), 0, -1):
#     # 정렬된 것 반대편부터.
#     # 인덱스니까 길이에서 -1
#     if sorted_nums[i-1] + sorted_nums[0] > target:
#         # 합이 만약 더 크다면?
#         sliced_nums = sorted_nums[0:i-1]  # 해당인덱스 빼고 슬라이싱.
#         print(1)
#     elif sorted_nums[i-1] + sorted_nums[0] == target:
#         # result = [0, i-1]
#         if sorted_nums[i-1] == sorted_nums[0]:
#             result.extend(sameValueIndex(sorted_nums[0]))
#             print(1, result)
#         result.append(nums.index(sorted_nums[0]))
#         result.append(nums.index(sorted_nums[i-1]))
#         print(2, result)
#         sliced_nums = sorted_nums[0:i+1]

#         break
#     else:
#         sliced_nums = sorted_nums[0:i]
#         break
#         # k = [i for i in nums if i <= target]
#         # print(k)
# print(3, sliced_nums)


# for i in range(len(sliced_nums)):
#     for k in range(i+1, len(sliced_nums)):
#         if plus(sliced_nums[i], sliced_nums[k], target):
#             if sliced_nums[i] == sliced_nums[k]:
#                 result.extend(sameValueIndex(sliced_nums[i]))
#             else:
#                 result.append(nums.index(sliced_nums[i]))
#                 result.append(nums.index(sliced_nums[k]))
#             print(4, result)
#         print(5, "틀ㄹ렸어!")
# # 가장 먼저 순서대로 정렬을 하고
# # 배열을 타겟되는 숫자보다 작은 것들만 있게 만들어준다.

from pip import List


nums = [3, 2, 3]
# # nums = [2, 7, 11, 15]
# # nums = [3, 2, 4]
target = 6

# 첫번째 답안. 보수를 이용한 방법으로 In으로 해당 보수가 존재하는지를 검사하는 방식


def twoSum(nums: List[int], target: int) -> List[int]:
    for i, n in enumerate(nums):
        complement = target - n

        if complement in nums[i+1:]:
            """
                nums.index(complement)로 하지않고
                nums[i+1:]로 짤라서 검사하는 이유는 
                똑같은 숫자가 나왔을 때 index는 먼저 나오는 것을 리턴하기 때문이다. 
            """
            return [i, nums[i+1:].index(complement)+(i+1)]


def twoSum(nums: List[int], target: int) -> List[int]:
    nums_map = {}
    for i, num in enumerate(nums):
        nums_map[num] = i

    for i, num in enumerate(nums):
        if target-num in nums_map and i != nums_map[target-num]:
            return [i, nums_map[target-num]]
