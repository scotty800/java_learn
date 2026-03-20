
def fibonacci(n):
    if n <= 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)

#solution 2

def fibonacci(n, memo={}):

    if n in memo:
        return memo[n]

    if n <= 1:
        return n
    
    memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo)

    return memo[n]
