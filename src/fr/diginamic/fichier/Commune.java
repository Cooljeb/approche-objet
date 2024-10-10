package fr.diginamic.fichier;

/**
 * créez une classe Ville avec les attributs suivants :
 * o Nom
 * o Code département
 * o Nom de la région
 * o Population totale
 */

// Variables d'instance
public class Commune {
    private String nom;
    private String codeDpt;

    private String nomRegion;

    private int popTotale;


    //Constructeur de la classe

    public Commune(String nom, String codeDpt, String nomRegion, Integer popTotale) {
        this.nom = nom;
        this.codeDpt = codeDpt;
        this.nomRegion = nomRegion;
        this.popTotale = popTotale;
    }

    //getters

    public String getNom() {
        return nom;
    }

    public String getCodeDpt() {
        return codeDpt;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getPopTotale() {
        return popTotale;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCodeDpt(String codeDpt) {
        this.codeDpt = codeDpt;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public void setPopTotale(int popTotale) {
        this.popTotale = popTotale;
    }

    @Override public String toString() {
        return "\n"+ nom +";"+ codeDpt+";" + nomRegion + ";" + popTotale;

    }
}


