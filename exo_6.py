
def count_letters(s):
    count = 0
    for char in s.lower():
        if 'a' <= char <= 'z' :
            count += 1
    return count