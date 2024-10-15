package fr.diginamic.recensement.application;

import fr.diginamic.recensement.data.Recensement;
import fr.diginamic.recensement.menu.*;

import java.io.IOException;
import java.util.Scanner;

/**
 *Point d'entrée de notre application Recensement
 */
public class ApplicationRecensement {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in); // va permettre de récupérer la saisie utlisateurr
        char rep = 'o'; // réponse de l'utilisateur
        int choix ;// correspond à l'option de menu de l'utilisateur

        while (rep == 'o' || rep == 'O') {
            do { // boucle d'affichage du menu tant que le choix utilisateur est différent des 9 options
            System.out.println("""
                     ____________________________________________________________
                    |                                                            |
                    |**************----Application Recensement-----**************|
                    |____________________________________________________________|
                    Menu :
                     1. Population d’une ville donnée
                     2. Population d’un département donné
                     3. Population d’une région donnée
                     4. Afficher les 10 régions les plus peuplées
                     5. Afficher les 10 départements les plus peuplés
                     6. Afficher les 10 villes les plus peuplées d’un département
                     7. Afficher les 10 villes les plus peuplées d’une région
                     8. Afficher les 10 villes les plus peuplées de France
                     9. Sortir
                    (choisir  parmi les options 1->9)""");

                choix = sc.nextInt(); // saisie de l'option de menu
                /**
                 * Cas de gestion des différentes options de menu
                 * 1. Population d’une ville donnée
                 * 2. Population d’un département donné
                 * 3. Population d’une région donnée
                 * 4. Afficher les 10 régions les plus peuplées
                 * 5. Afficher les 10 départements les plus peuplés
                 * 6. Afficher les 10 villes les plus peuplées d’un département
                 * 7. Afficher les 10 villes les plus peuplées d’une région
                 * 8. Afficher les 10 villes les plus peuplées de France
                 * 9. Sortir
                 */
                switch (choix) { // Traitement des différentes options de menu

                    case 1:
                        RecherchePopulationVille recherchePv = new RecherchePopulationVille();
                        recherchePv.traiter(new Recensement(),sc );
                        break;
                    case 2:
                        RechercheDepartement rechercheDpt = new RechercheDepartement();
                        rechercheDpt.traiter(new Recensement(), sc);
                        break;
                    case 3:
                        RechercheRegion rechercheR = new RechercheRegion();
                        rechercheR.traiter(new Recensement(), sc);
                        break;
                    case 4:
                        DixRegionsPeuplees rechercheRp = new DixRegionsPeuplees();
                        rechercheRp.traiter(new Recensement(), sc);
                        break;
                    case 5:
                        DixDepartementsPeuplees rechercheDdp = new DixDepartementsPeuplees();
                        rechercheDdp.traiter(new Recensement(),sc);
                        break;
                    case 6:
                        DixVillesDepartement rechercheDvp = new DixVillesDepartement();
                        rechercheDvp.traiter(new Recensement(), sc);
                        break;
                    case 7:
                        DixVillesRegion rechercheDvr = new DixVillesRegion();
                        rechercheDvr.traiter(new Recensement(), sc);
                        break;
                    case 8:
                        DixVillesFrance rechercheDvf = new DixVillesFrance();
                        rechercheDvf.traiter(new Recensement(), sc);
                        break;
                    case 9:
                        sc.close();
                        Sortie.sortie();
                        break;
                    default:
                        // Traitement de l'erreur de saisie
                        System.out.println("Option de menu inconnue ❌");
                }
            } while (erreur(choix));

            rep=continuer();
        }
        //Fin de boucle on  sort du programme
        System.out.println("Au revoir !!!");
        sc.close();
        System.exit(0);
    }

    /**
     * Fonction qui interroge l'utilisateur si il veu continuer ou non
     * si oui on réaffiche le menu
     * sinon on quitte l'application avec un message sympa :)
     * @return rep
     */
    static  char continuer() {
        char rep ;
        do {
            System.out.println("Voulez-vous continuer (O/N) ? (o pour Oui, n pour Non, accepté)");
            String temp;
            Scanner scan2 = new Scanner(System.in);
            temp = scan2.nextLine();
            rep = temp.charAt(temp.length() - 1);//récupération du contenu de la chaine de caractère qui est O/o/N/n

            if (rep != 'O' && rep != 'o' && rep != 'n' && rep != 'N') {
                System.out.println("Réponse incorrecte");
            }
        } while (rep != 'O' && rep != 'o' && rep != 'n' && rep != 'N');
        return rep;
    }

    /**
     * Méthode testant ma non saisie d'erreur option de menu prévue
     * @param e
     * @return <b>False</b>si la saisie ne correspond pas à l'attendue,<b>True</b> dans le cas contraire
     */
    static boolean erreur(int e) {
        if (e !=1 && e !=2 && e !=3 && e !=4 && e !=5 && e !=6 && e !=7 && e !=8 && e !=9) {
            return false;
        }
        return true;
    }
}
