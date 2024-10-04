package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

    public static void main(String[] args) {
        Compte tabCompte[] = new Compte[2]; // tableau de compte
        Compte cpt1 = new Compte(1,3000); // compte courant
        CompteTaux cpt2 =  new CompteTaux(2,2563,5.50);// compte + taux
        //affectation des valeurs au tableau de comtpes
        tabCompte[0] = cpt1;
        tabCompte[1] = cpt2;

        // lecture du tableau avec la représentation du de chaque objet
        for (int i = 0; i < tabCompte.length ; i++) {
            System.out.println(tabCompte[i].toString());
        }
    }

}
