package fr.diginamic.maison;

/**
 * •
 * On va commencer par créer une classe abstraite Piece, qui a 2 attributs :
 *
 * la superficie
 *
 * le numéro de l’étage. On considèrera par convention que l’étage 0 désigne le RDC, 1 le 1er étage, et ainsi de suite.
 *
 * La classe Piece a un constructeur avec 2 paramètres permettant d’initialiser les variables d’instance superficie et étage.
 */
public abstract class Piece {

    //Variable d'instance
    protected double superficie;
    protected int etage;

    // Constructeur

    public Piece(double superficie, int etage) {

        this.superficie = superficie;
        this.etage = etage;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }
}
