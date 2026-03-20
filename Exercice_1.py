
s = "hello world"

def voyelles(s):
    count = 0
    voyelles = "a e i o u y"

    for c in s:
        if c in voyelles:
            count += 1
    return count