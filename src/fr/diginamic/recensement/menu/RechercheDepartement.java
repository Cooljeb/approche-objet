package fr.diginamic.recensement.menu;

import fr.diginamic.recensement.data.Departement;
import fr.diginamic.recensement.data.Recensement;

import java.util.Scanner;

public class RechercheDepartement extends  MenuService{

    boolean trouve;
    //Constructeur

    public RechercheDepartement() {
    }

    @Override public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("De quel département voulez-vous connaître la population totale ?");
        scanner = new Scanner(System.in);
        String v = scanner.nextLine();
        int poptotal =0;
        Departement d=new Departement(v);

        for (int i = 0; i < recensement.getMesCommunes().size(); i++) {
            if(d.getDepartement().equals(recensement.getMesCommunes().get(i).getDpt().getDepartement())){
                poptotal += recensement.getMesCommunes().get(i).getPopTotale();
            }

        }
        System.out.println("Le département "+v+" a "+poptotal+" habitants");
    }
}
