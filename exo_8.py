def longest_k_distinct(s):
    from collections import defaultdict

    count = defaultdict(int)
    left = 0
    max_len = 0

    for right, char in enumerate(s):
        count[char] += 1

        while len(count) > 2:
            count[s[left]] -= 1
            if count[s[left]] == 0:
                del count[s[left]]
            left += 1

        max_len = max(max_len, right - left + 1)

    return max_len