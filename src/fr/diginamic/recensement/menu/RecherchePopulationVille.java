package fr.diginamic.recensement.menu;

import fr.diginamic.recensement.data.Recensement;

import java.util.Scanner;

/**
 * Recherche de la population d'une ville saisie
 */
public class RecherchePopulationVille extends  MenuService{
    boolean trouve;
    //Constructeur de la classe
    public RecherchePopulationVille() {
    }

    @Override public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("De quelle ville voulez-vous connaitre la "
                + "population totale ?");
        scanner = new Scanner(System.in);
        String v = scanner.nextLine();

        for (int i = 0; i < recensement.getMesCommunes().size(); i++) {

            if (v.equals(recensement.getMesCommunes().get(i).getNomCommune())) {
                System.out.println(
                        "Population  de " + v + " est " + recensement.getMesCommunes().get(i).getPopTotale());
                trouve =true;
                break;
            }
        }
        if(!trouve) {
            System.out.println("Ville saisie non trouvée");
        }
    }
}
