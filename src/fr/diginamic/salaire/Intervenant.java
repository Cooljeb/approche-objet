package fr.diginamic.salaire;

public abstract class Intervenant {
    //Atrtibuts d'instance
    protected String nom;
    protected String prenom;

    //Constructeur de la classe
    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // méthode qui sera implémentée dans les classes "filles"
    public abstract double getSalaire();

    public  void afficherDonnee() {
        System.out.println(toString());
    }

    @Override public String toString() {
        return "{" + "nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + '}';
    }
}
