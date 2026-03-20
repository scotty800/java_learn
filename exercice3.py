
nums = [3,3,4,2,3,3,5]

def majority_element(nums):
    count = {}

    for num in nums:
        count[num] = count.get(num, 0) + 1

        if count[num] > len(nums) // 2:
            return num
    return None
