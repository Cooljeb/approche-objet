package fr.diginamic.banque.entites;

import java.text.DecimalFormat;
import java.util.Objects;

public class TestOperation {

    public static void main(String[] args) {

        // Varibales de types Operation (debit et credit)
        Credit c1 = new Credit("07/10/2024",550.0d);
        Credit c2 = new Credit("07/10/2024",550.0d);
        Debit d1 = new Debit("07/10/2024",689.0d);
        Debit d2 = new Debit("07/10/2024",300.0d);

        Operation [] tabOperation =   {c1,c2,d1,d2}; // déclaration et initialisation du tableeau des opérations
        double global=0d; // variable servant au calcul global des opérations

        for (int i = 0; i < tabOperation.length; i++) {
            System.out.println(tabOperation[i].getDateOperation() +" :  montant :" + tabOperation[i].getMontant()+
                    " ==> "+ tabOperation[i].getType());
            global=tabOperation[i].calculTotal(global);
//            if(Objects.equals(tabOperation[i].getType(), "CREDIT")) {
//                global+=tabOperation[i].getMontant();
//            }else{
//                global-=tabOperation[i].getMontant();
//            }
        }
        DecimalFormat formateur = new DecimalFormat("#.00");
        String sommeFormatee = formateur.format(global);
        System.out.println("La somme est égale à :"+sommeFormatee);
//        if (global>0){
//            System.out.println("Montant total des opérations = + " +global+" €");
//        }else{
//            System.out.println("Montant total des opérations : " +global+" €");
//        }

    }
}
