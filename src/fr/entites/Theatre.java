package fr.entites;

public class Theatre {
    //Variables d'instance
    private String nom; // nom du théâtre
    private int capaciteMax; // capacité max du tableau
    private int nbClientsInscrits; // nombre de clients inscrits
    private int recette=0; // recette totale de l'établissements

    private int prix = 5;


    //Constructeur

    public Theatre(String nom, int capaciteMax, int nbClientsInscrits, int recette) {
        this.nom = nom;
        this.capaciteMax = capaciteMax-nbClientsInscrits;
        this.nbClientsInscrits = nbClientsInscrits;
        this.recette = (recette+nbClientsInscrits*prix);
    }

    //Accesseurs

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public int getNbClientsInscrits() {
        return nbClientsInscrits;
    }

    public void setNbClientsInscrits(int nbClientsInscrits) {
        this.nbClientsInscrits = nbClientsInscrits;
    }

    public int getRecette() {
        return recette;
    }

    public void setRecette(int recette) {
        this.recette = recette;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public  void inscrire(int nbinscriptions, int prix) {

        if (nbinscriptions <= capaciteMax){
            nbClientsInscrits+=nbinscriptions;
            recette+=(nbinscriptions*prix);
            capaciteMax-=nbinscriptions;
        }else{
            System.out.println("Inscription Impossible, place(s) restantes(s) "+capaciteMax);
        }
    }

}
