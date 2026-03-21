
def count_occurences(nums):
    hash_map = {}

    for num in nums:
        if num in hash_map:
            hash_map[num] += 1
        else:
            hash_map[num] = 1
            
    return hash_map