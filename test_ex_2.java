
public class test_ex_2 {

    public static boolean palindrome(String mot) {
        mot = mot.toLowerCase().replace(" ", "");

        int left = 0;
        int right = mot.length() - 1;

        while (left < right) {
            if (mot.charAt(left) != mot.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String mot1 = "Radar";
        String mot2 = "Hello";
        System.out.println(palindrome(mot1)); // true
        System.out.println(palindrome(mot2)); // false
    }
}