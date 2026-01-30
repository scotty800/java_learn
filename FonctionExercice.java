public class FonctionExercice {

    // Exercice 5.1 — carré
    public static int carre(int n) {
        return n * n;
    }

    // Exercice 5.2 — positif ou pas
    public static boolean estPositif(int n) {
        return n > 0;
    }

    // Exercice 5.3 — maximum de trois nombres
    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    // Méthode main pour exécuter le programme
    public static void main(String[] args) {

        // Test de la méthode carre
        int resultatCarre = carre(4);
        System.out.println("Le carré de 4 est: " + resultatCarre);

        // Test de la méthode estPositif
        boolean positif = estPositif(-3);
        System.out.println("Est-ce que -3 est positif ? " + positif);

        // Test de la méthode max
        int maximum = max(10, 20, 15);
        System.out.println("Le maximum de 10, 20 et 15 est: " + maximum);
    }
}
