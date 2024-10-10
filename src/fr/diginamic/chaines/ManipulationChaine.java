package fr.diginamic.chaines;

import fr.entites.Salarie;

public class ManipulationChaine {

    public static void main(String[] args) {

        String chaine = "Durand;Marcel;2 523.5";// variable
        char premierCaractere = chaine.charAt(0);
        String[] tabChaine = chaine.split(";");
        String nom;
        String prenom;
        Double salaire;

        // Affichage du 1er caractère de la chaîne
        System.out.println("Premier caractère: " + premierCaractere);

        //Longueur de la chaîne
        System.out.println("longeur de la chaîne : " +chaine.length());

        //afficher l’index du premier « ; » contenu dans la chaine de caractères.
        System.out.println("afficher l’index du premier « ; »  :" +chaine.indexOf(';'));

        //Combinez la méthode substring et indexOf pour extraire le nom de famille de la personne.
        System.out.println(chaine.substring(0,chaine.indexOf(';')));

        // afficher le nom de famille en majuscules
        System.out.println(chaine.substring(0,chaine.indexOf(';')).toUpperCase());

        // afficher le nom de famille en minuscule
        System.out.println(chaine.substring(0,chaine.indexOf(';')).toLowerCase());

        //Affichage de la chaîne "Splittée"
        for (int i = 0; i <tabChaine.length ; i++) {
            System.out.println(tabChaine[i]);
        }
        // affectation des valeurs du tableau aux variables nom, prenon, salire

        nom =tabChaine[0];
        prenom = tabChaine[1];
        salaire =Double.parseDouble(tabChaine[3].replace(" ",""));

        //Création d'un nouveau salarié
        Salarie s1 = new Salarie(nom, prenom, salaire);


    }
}
