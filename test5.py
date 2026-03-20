
num = [4, 2, 9, 1, 5 ]

def maximum(num):
    max_num = num[0]

    for n in num:
        if n > max_num:
            max_num = n

    return max_num