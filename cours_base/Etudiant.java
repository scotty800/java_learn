package cours_base;
public class Etudiant extends Personne{
    private int note;

    public Etudiant(String nom, int age, int note) {
        super(nom, age);
        this.note = note;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void afficherDetails() {
        sePresenter();
        System.out.println("Ma Note est: " + note);
    }
}
