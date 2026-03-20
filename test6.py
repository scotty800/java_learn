
nums = [1, 2, 2, 3, 2]

def count_occurrences(nums, target):
    count = 0

    for num in nums:
        if num == target:
            count += 1

    return count

#solution 2

def count_occurrences(nums, target):
    count = 0
    hash_map = {}

    for num in nums:
        if num in hash_map:
            hash_map[num] += 1
        else:
            hash_map[num] = 1

    return hash_map.get(target, 0)