package fr.diginamic.maps;

/**
 * Classe Pays
 */
public class Pays {

    //Variables

    private String nom;
    private String nombreHabitants;
    private String continent;

    //Constructeur



    public Pays(String nom, String nombreHabitants, String continent) {
        this.nom = nom;
        this.nombreHabitants = nombreHabitants;
        this.continent = continent;
    }

    // Accesseurs

    public String getNom() {
        return nom;
    }

    public String getNombreHabitants() {
        return nombreHabitants;
    }

    public String getContinent() {
        return continent;
    }
}
