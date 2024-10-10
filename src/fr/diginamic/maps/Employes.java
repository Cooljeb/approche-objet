package fr.diginamic.maps;

/**
 * Classe des employés
 */
public class Employes {
    // varibales d'instances
    String prenom;
    float salaire ;

    //Constructeur
    public Employes(String prenom, float salaire) {
        this.prenom = prenom;
        this.salaire = salaire;
    }

    // Accesseurs

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }


}
