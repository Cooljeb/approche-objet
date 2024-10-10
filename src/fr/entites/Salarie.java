package fr.entites;

/**
 * Classe des Salariés
 */
public class Salarie {
    // variables
    private String nom; // nom du salarié
    private String prenom; // prénom du salarié
    private double salaire; //salaire du salarié

    //Constructeur

    public Salarie(String nom, String prenom, double salaire) {
        this.nom = nom.toUpperCase();
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
