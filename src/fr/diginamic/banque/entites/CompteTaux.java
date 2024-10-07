package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    /**
     * Constructeur de compte
     *
     * @param numCompte   alias numéro de compte
     * @param soldeCompte alias solde du compte
     * @param taux rémunération
     */

    private static double taux = 0.00f;
    public CompteTaux(int numCompte, int soldeCompte, double taux) {
        super(numCompte, soldeCompte);
        this.taux=taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    @Override public String toString() {

        String infosCompte = super.toString();
        return "CompteTaux{ "+infosCompte+" + taux "  + taux +" % }";
    }
}
