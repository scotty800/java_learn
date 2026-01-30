public class Main {
    public static void main(String[] args) {
        Etudiant[] students = new Etudiant[3];
        students[0] = new Etudiant("Alice", 20, 85);
        students[1] = new Etudiant("Bob", 22, 90);
        students[2] = new Etudiant("Charlie", 19, 78);

        for (Etudiant etudiant : students) {
            etudiant.afficherDetails();
            System.out.println("------------------");
        }

        int somme = 0;
        for (Etudiant etudiant : students) {
            somme += etudiant.getNote();
        }

        double moyenne = (double) somme / students.length;
        System.out.println("La moyenne des notes est: " + moyenne);
    }
}
