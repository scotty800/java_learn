
def is_valid(s):
    stack = []

    pairs = {
        '(': ')',
        '[': ']',
        '{': '}'
    }

    for c in s:
        if c in pairs.keys():
            stack.append(c)
        elif c in pairs.values():
            if not stack or pairs[stack[-1] != c]:
                return False
            stack.pop()

    return len(stack) == 0