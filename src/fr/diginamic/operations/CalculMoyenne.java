package fr.diginamic.operations;

import java.util.Arrays;
import java.util.Scanner;

public final class CalculMoyenne {

    private double [] tabDouble=new double[0];
    char rep = 'o';
    int cpt = 0;
    //Constructeur

    public CalculMoyenne() {

    }

    //Accesseurs

    public double[] getTabDouble() {
        return tabDouble;
    }

    public void setTabDouble(double[] tabDouble) {
        this.tabDouble = tabDouble;
    }

    /**
     * permet l'ajout d'un double dans le tableau
     */
    public  double [] ajout () {


        while (rep == 'o' || rep == 'O') {

            Scanner sc = new Scanner(System.in);
            //Saisie du double à ajouter au tableau
            System.out.println("Saisir le chiffre à ajouter :");

            int tailleTab = tabDouble.length;

            if (cpt == tailleTab) {
                tabDouble = Arrays.copyOf(tabDouble, tabDouble.length + 1);
                double db = sc.nextDouble();
                tabDouble[tabDouble.length - 1] = db;
                cpt++;
            } else {
                double db = sc.nextDouble();
                tabDouble[tailleTab] = db;
                cpt++;
            }
            reponse();
        }

        System.out.println("Ajout effectué");
        return (tabDouble);

    }

    /**
     * Méthode qui permet d'évaluer la réponse utilisateur
     * si O ou o => on continue d'ajouter
     * si n on sort et on continue le programme
     */
    void reponse() {
        do{
            System.out.println("Voulez-vous ajouter un autre nombre ? (O/N) ? (o pour Oui, n pour Non, accepté)");
            String temp ;
            Scanner scan2 = new Scanner(System.in);
            temp = scan2.nextLine();
            rep = temp.charAt(temp.length()-1);//récupération du contenu de la chaine de caractère qui est O/o/N/n

            if (rep != 'O' && rep != 'o' && rep != 'n' &&  rep != 'N') {
                System.out.println("Réponse incorrecte");
            }
        } while(rep != 'O' && rep != 'o' && rep != 'n' &&  rep != 'N');
    }
    /**
     * Méthode qui retourne la moyenne des éléments du tableau
     */
    public void calcul(){

        double cumul=0.0d; // varibale qui mert le cumul de la somme des éléments ddu tableau

        for (int i = 0; i <tabDouble.length; i++) {
            cumul+=tabDouble[i];
        }
        /*System.out.println(cumul);
        System.out.println(tabDouble.length);*/ //Test

        //Affichage de la moyenne des données présentes dans le tableau
        System.out.println("La moyenne des éléments est égale à " +(cumul/tabDouble.length));
    }

}
