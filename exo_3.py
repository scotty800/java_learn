def longest_subarray(nums, k):
    left = 0
    current_sum = 0
    max_length = 0

    for right in range(len(nums)):
        current_sum += nums[right]

        while current_sum > k:
            current_sum -= nums[left]
            left += 1

        max_length = max(max_length, right - left + 1)

    return max_length