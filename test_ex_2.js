
function estPalindrome(mot) {
    mot = mot.toLowerCase().replace(" ", "");

    let left = 0;
    let right = mot.length - 1;

    while (left < right) {
        if (mot[left] !== mot[right]) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

let mot1 = "radar";
let mot2 = "hello";
console.log(estPalindrome(mot1)); // true
console.log(estPalindrome(mot2)); // false
