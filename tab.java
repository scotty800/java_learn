import java.util.*;

public class tab {
    public static void main(String[] args) {
        ArrayList<String> etudiants = new ArrayList<>();
        etudiants.add("Alice");
        etudiants.add("Bob");
        etudiants.add("Charlie");
        etudiants.add("Diana");
        etudiants.add("Ethan");

        for (String etudiant : etudiants) {
            System.out.println(etudiant);
        }

        etudiants.remove("Charlie");

        System.out.println("Liste mise à jour :");
        for (String etudiant : etudiants) {
            System.out.println(etudiant);
        }

        HashSet<Integer> nombres = new HashSet<>();
        nombres.add(1);
        nombres.add(2);
        nombres.add(2);

        System.out.println("Nombres dans le HashSet : " + nombres);

        HashMap<String, Integer> notes = new HashMap<>();
        notes.put("Alice", 85);
        notes.put("Bob", 90);
        notes.put("Diana", 95);

        int somme = 0;
        for (String etudiant : notes.keySet()) {
            System.out.println(etudiant + " : " + notes.get(etudiant));
            somme += notes.get(etudiant);
        }
        double moyenne = (double) somme / notes.size();
        System.out.println("Moyenne des notes : " + moyenne);
    }
}
