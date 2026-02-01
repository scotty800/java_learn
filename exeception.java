import java.util.Scanner;

public class exeception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Entrez un nombre : ");
            int nombre = scanner.nextInt();

            int result = nombre / 0;
            System.out.println("Résultat : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Erreur : Division par zéro impossible.");
        }

        try {
            int[] tableau = {1, 2, 3};
            System.out.println(tableau[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : Index hors limites du tableau.");
        }

        try {
            verifierSolde(100, 150);
        } catch (SoldeInsuffisantException e) {
            System.out.println("Erreur bancaire : " + e.getMessage());
        }

        scanner.close();
    }

     public static void verifierSolde(double solde, double retrait)
            throws SoldeInsuffisantException {

        if (retrait > solde) {
            throw new SoldeInsuffisantException(
                "Solde insuffisant pour un retrait de " + retrait
            );
        }

        System.out.println("Retrait de " + retrait + " effectué avec succès.");
    }
}
