
nom = "hello"

def reverser(nom):
    return nom[::-1]

#solution 2

def reverser(nom):

    nom = list(nom)

    left = 0
    right = len(nom) - 1

    while left < right:
        nom[left], nom[right] = nom[right], nom[left]

        left += 1
        right -= 1

    return "".join(nom)
