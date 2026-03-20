
nom1 = "listen"
nom2 = "silent"

def sont_anagrammes(nom1, nom2):
    nom1 = nom1.lower()
    nom2 = nom2.lower()

    return sorted(nom1) == sorted(nom2)

print(sont_anagrammes(nom1, nom2))

#solution 2

def sont_anagrammes(nom1, nom2):
    nom1 = nom1.lower()
    nom2 = nom2.lower()

    hash_map = {}

    for char in nom1:
        if char in hash_map:
            hash_map[char] += 1
        else:
            hash_map[char] = 1

    for char in nom2:
        if char in hash_map:
            hash_map[char] -= 1
        else:
            return False

    for count in hash_map.values():
        if count != 0:
            return False

    return True