package fr.diginamic.recensement.tests;

import fr.diginamic.recensement.data.Recensement;
import fr.diginamic.recensement.menu.*;

import java.io.IOException;
import java.util.Scanner;

public class TestRecensement {

    public static void main(String[] args) throws IOException {
        Recensement r = new Recensement();
        //System.out.println(r.getMesCommunes());
        //RecherchePopulationVille re = new RecherchePopulationVille();
        Scanner s=new Scanner(System.in);;
        //re.traiter(r,s);
        //RechercheDepartement re = new RechercheDepartement();
        //RechercheRegion re = new RechercheRegion();
        //DixRegionsPeuplees re = new DixRegionsPeuplees();
        //DixDepartementsPeuplees re = new DixDepartementsPeuplees();
        //DixVillesDepartement re = new DixVillesDepartement();
        //DixVillesRegion re = new DixVillesRegion();
        DixVillesFrance re = new DixVillesFrance();
        re.traiter(r,s);

    }
}
