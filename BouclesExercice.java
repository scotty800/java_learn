
public class BouclesExercice {
    public static void main(String[] args) {

        int [] nombres = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre actuel: " + nombres[i]);
        }

        int i = 0;
        while (i < nombres.length) {
            if (nombres[i] % 2 == 0) {
                System.out.println(nombres[i] + " est un nombre pair.");
            }
            i++;
        }

        int somme = 0;
        for (int n : nombres) {
            somme += n;
        }
        System.out.println("La somme des nombres dans le tableau est: " + somme);
    }
}