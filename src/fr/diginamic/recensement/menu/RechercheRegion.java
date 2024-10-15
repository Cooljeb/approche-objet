package fr.diginamic.recensement.menu;

import fr.diginamic.recensement.data.Departement;
import fr.diginamic.recensement.data.Recensement;
import fr.diginamic.recensement.data.Region;

import java.util.Scanner;

public class RechercheRegion extends MenuService{

    //constructeur

    public RechercheRegion() {
    }

    @Override public void traiter(Recensement recensement, Scanner scanner) {

        System.out.println("De quelle région voulez-vous connaître la population totale (saisie code)?");
        scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        String nomR="";
        int poptotal =0;

        Region r=new Region(v);

        for (int i = 0; i < recensement.getMesCommunes().size(); i++) {
            if(r.getCodeRegion()==recensement.getMesCommunes().get(i).getCodeR().getCodeRegion()){
                poptotal += recensement.getMesCommunes().get(i).getPopTotale();
                nomR= recensement.getMesCommunes().get(i).getCodeR().getNomRegion();
            }

        }
        System.out.println("la popoulation totale de la région "+nomR+" code ("+r.getCodeRegion()+")"
                + " est :"+poptotal+" habitants");

    }
}
