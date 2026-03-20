
num = [3, 7, 2, 9, 1]

def find_maximum(nums): 
    if not nums: 
        return None 

    max_num = nums[0] 

    for n in nums: 
        if n > max_num: 
            max_num = n
             
    return max_num