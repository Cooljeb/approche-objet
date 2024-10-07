package fr.diginamic.banque.entites;

public class Debit extends Operation {

    public Debit(String dateOperation, double montant) {

        super(dateOperation, montant);
    }

    @Override public String getType() {
        return "DEBIT";
    }
    @Override public String toString() {
        return "Opération de débit  " + super.toString() + getType().toUpperCase();
    }
}
