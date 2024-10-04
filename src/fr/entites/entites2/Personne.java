package fr.entites.entites2;

import fr.entites.AdressePostale;

public class Personne {
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adresse ) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public String nom;
    public String prenom;
    public AdressePostale adresse;

    // Méthode qui permet d'afficher le nom et le prénom
    void nomPrenom() {
        System.out.println(nom.toUpperCase()+" "+prenom );
    }
    // Modification du nom
    public void  modifNom(String nm) {
        this.nom=nm;
    }
    // Modification du prénom
    public void  modifPrenom(String pnm) {
        this.prenom=pnm;
    }

    public void modifierAdresse(AdressePostale adresse) {
        this.adresse = adresse;
    }

    public String retournerNom() {
        return nom;
    }

    public String retournerPrenom() {
        return prenom;
    }

    public AdressePostale retournerAdresse() {
        return adresse;
    }
    //vivement les constructeurs
}
