
nom1 = "radar"
nom2 = "hello"

def est_palindrome(nom):
    nom = nom.lower()
    return nom == nom[::-1]

print(est_palindrome(nom1))
print(est_palindrome(nom2))

#solution 2

def est_palindrome(nom):
    nom = nom.lower()

    left = 0
    right = len(nom) - 1

    while left < right:
        if nom[left] != nom[right]:
            return False
        left += 1
        right -= 1

    return True

print(est_palindrome(nom1))
print(est_palindrome(nom2))