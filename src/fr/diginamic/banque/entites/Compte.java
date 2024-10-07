package fr.diginamic.banque.entites;

public class Compte {

    //variables de classe
    private Long numCompte;
    private int soldeCompte;

    //constructeur

    /**
     * Constructeur de compte
     * @param numCompte alias numéro de compte
     * @param soldeCompte alias solde du compte
     */
    public Compte(Long numCompte, int soldeCompte) {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }

    /**
     * getter de numCompte
     * @return numCompte
     */
    public Long getNumCompte() {
        return numCompte;
    }

    @Override public String toString() {
        return "Compte{" + "numCompte=" + numCompte + ", soldeCompte=" + soldeCompte + '}';
    }

    /**
     * setter de numéro de compte
     * @param numCompte
     */
    public void setNumCompte(Long numCompte) {
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
