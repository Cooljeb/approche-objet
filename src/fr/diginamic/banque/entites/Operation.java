package fr.diginamic.banque.entites;

/**
 * Classe décrivant une opération bancaire
 */
public abstract class Operation {
    //Attributs de la classe

    protected String dateOperation; // date de l'op
    protected double montant;


    // Constructeur

    public Operation(String dateOperation, double montant) {
        this.dateOperation = dateOperation;
        this.montant = montant;
    }

    //getters et Setters
    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(long montant) {
        this.montant = montant;
    }

    //méthode abstraite
    public abstract String getType();

    @Override public String toString() {
        return "Operation{" + "dateOperation='" + dateOperation + '\'' + ", montant=" + montant + '}';
    }
}
