package cours_base;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            FileReader fr = new FileReader("eleves.txt");
            BufferedReader br = new BufferedReader(fr);

            String ligne;
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier");
        }

        try {
            FileWriter fw = new FileWriter("nouveaux_eleves.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 1; i <= 5; i++) {
                System.out.print("Entrez le nom de l'élève #" + i + " : ");
                String nom = scanner.nextLine();
                bw.write(nom);
                bw.newLine();
            }
            bw.close();
            System.out.println("Noms enregistrés dans 'nouveaux_eleves.txt'.");

        } catch (IOException e) {
            System.out.println("Erreur lors de l’écriture du fichier : " + e.getMessage());
        }

        try {
            FileReader fr = new FileReader("eleves.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("eleves_num.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            String ligne;
            int compteur = 1;

            while ((ligne = br.readLine()) != null) {
                bw.write(compteur + ". " + ligne);
                bw.newLine();
                compteur++;
            }

            br.close();
            bw.close();

            System.out.println("Fichier 'eleves_num.txt' créé avec succès !");

        } catch (IOException e) {
            System.out.println("Erreur lors du traitement des fichiers : " + e.getMessage());
        }

        scanner.close();
    }
}
