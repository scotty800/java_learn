
nums = [2, 7, 11, 15]
target = 9

def two_sum(nums, target):
    hash_map = {}


    for i, num in enumerate(nums):
        complement = target - num

        if complement in hash_map:
            return [hash_map[complement], i]
            
        hash_map[num] = i
    return []

#solution 2

def two_sum(nums, target):
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]
    return []