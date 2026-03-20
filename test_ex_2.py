
mot1 = "Radar"
mot2 = "Hello"

def est_palindrome(mot):
    mot = mot.lower().replace(" ", "")

    left = 0
    right = len(mot) - 1

    while left < right:
        if mot[left] != mot[right]:
            return False
        left += 1
        right -= 1
    
    return True

print(est_palindrome(mot1))
print(est_palindrome(mot2))