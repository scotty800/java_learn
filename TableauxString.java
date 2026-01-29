
public class TableauxString {
    public static void main(String[] args) {
        int [] nombres = {5, 10, 15, 20, 25};
        int somme = 0;
        int plusGrand = nombres[0];

        for (int n : nombres) {
            somme += n;
            if (n > plusGrand) {
                plusGrand = n;
            }
        }
        double moyenne = (double) somme / nombres.length;

        System.out.println("La somme des nombres est: " + somme);
        System.out.println("La moyenne des nombres est: " + moyenne);
        System.out.println("Le plus grand nombre est: " + plusGrand);

        String mot = "java";
        System.out.println("Nombre de caractères: " + mot.length());

        String inverse = "";
        for (int i = mot.length() - 1; i >= 0; i--) {
            inverse += mot.charAt(i);
        }
        System.out.println("Mot inversé: " + inverse);
    }
}
