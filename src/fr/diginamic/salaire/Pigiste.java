package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
    //Atributs d'instance
    private int nbjours;
    private  float salPige =60;

    //Constructeur
    public Pigiste(String nom, String prenom, int nbjours) {
        super(nom, prenom);
        this.nbjours = nbjours;
    }

    //Accesseurs
    public int getNbjours() {
        return nbjours;
    }

    public void setNbjours(int nbjours) {
        this.nbjours = nbjours;
    }

    public float getSalPige() {
        return salPige;
    }

    public void setSalPige(float salPige) {
        this.salPige = salPige;
    }
    //Méthode à implémenter de la classe mère

    @Override public double getSalaire() {
        return nbjours*salPige;
    }
    @Override public String toString() {
        return super.toString()+"{ Statut :}"+getClass().getSimpleName();
    }
}
