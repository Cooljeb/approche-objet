package fr.diginamic.salaire;

public class Salarie extends Intervenant{
    // atribut d'instance
    private double salaire;

    public Salarie(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    @Override public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override public String toString() {
        return super.toString()+"{ Statut :}"+getClass().getSimpleName();
    }
}
