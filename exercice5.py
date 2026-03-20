
nums = [1,2,3,4,2]

def has_duplicates(nums):
    seen = set()

    for num in nums:
        if num in seen:
            return True
        seen.add(num)

    return False