
s = "hello world"

def voyelles(s):
    count = 0
    voyelles = "aeiouy"

    for c in s.lower():
        if c in voyelles:
            count += 1
    return count