
public class VerifierNombre {
    public static void main(String[] args) {
        int n = 10;

        if (n % 2 == 0) {
            System.out.println(n + " est un nombre pair.");
        } else {
            System.out.println(n + " est un nombre impair.");
        }

        if (n > 0) {
            System.out.println(n + " est positif.");
        } else if (n < 0) {
            System.out.println(n + " est négatif.");
        } else {
            System.out.println(n + " est zéro.");
        }
    }
}
