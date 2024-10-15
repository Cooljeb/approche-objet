package fr.diginamic.recensement.data;

/**
 * Classe département
 */
public class Departement {
    //variable d'instance
    private String departement;

    //constructeur

    public Departement(String departement) {
        this.departement = departement;
    }

    //getter

    public String getDepartement() {

        return departement;
    }

    @Override public String toString() {
        return  departement;
    }
}
