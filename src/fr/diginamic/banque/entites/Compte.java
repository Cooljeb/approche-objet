package fr.diginamic.banque.entites;

public class Compte {

    //variables de classe
    private int numCompte;
    private int soldeCompte;

    //constructeur

    /**
     * Constructeur de compte
     * @param numCompte alias numéro de compte
     * @param soldeCompte alias solde du compte
     */
    public Compte(int numCompte, int soldeCompte) {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }

    /**
     * getter de numCompte
     * @return numCompte
     */
    public int getNumCompte() {
        return numCompte;
    }

    @Override public String toString() {
        return "Compte{" + "numCompte=" + numCompte + ", soldeCompte=" + soldeCompte + '}';
    }

    /**
     * setter de numéro de compte
     * @param numCompte
     */
    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    /**
     * getter de soldeCompte
     * @return soldeCompte
     */
    public int getSoldeCompte() {
        return soldeCompte;
    }

    /**
     * setter de  soldeCompte
     * @param soldeCompte
     */
    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }


}
