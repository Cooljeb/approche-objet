package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * lisez le contenu du fichier et affichez son contenu
 */
public class LectureFichier {

    public static void main(String[] args) throws IOException {

        //Séparateur de ligne

        //Création d'un arrayListe de ville vide
        ArrayList<Commune> mesCommunes = new ArrayList<>();

        //Path du fichier d'origine
        Path pathFile = Paths.get("C:/Users/jbrou/Desktop/Perso/Formation/DIGINAMIC/Cours/07 - Java approche POO/TP/recensement.csv");

        boolean exists = Files.exists(pathFile); // Permet de tester l'existence

        List<String> lignesFichier = Files.readAllLines(pathFile, StandardCharsets.UTF_8); // liste contenant toutes les lignes

        //affichage du fichier

        for (int i = 1; i <lignesFichier.size()-1 ; i++) {

            String[] tokens   = lignesFichier.get(i).split(";");
            String nom = tokens[6];
            String codeDpt = tokens[2].replaceAll(" ","");
            String nomRegion = tokens[1];
            int popTotale = Integer.parseInt(tokens[9].replaceAll(" ",""));
                    // Commune(String nom, int codeDpt, String nomRegion, int popTotale)
            mesCommunes.add(new Commune(nom,codeDpt,nomRegion,popTotale));
           // System.out.println(mesCommunes);
            //System.out.println (mesCommunes);
        }
        List<String> lines = new ArrayList<>();
        String entete = "Nom; Code Département ; Nom Region; Population Totale";

        lines.add(entete);
        //Génération d'une liste des communes
        //ArrayList<Commune> communesSup25K = new ArrayList<>();
        for (int i = 0; i < mesCommunes.size(); i++) {
            if(mesCommunes.get(i).getPopTotale()>=25000) {
                String  lignefichier= mesCommunes.get(i).getNom()+";"
                        +mesCommunes.get(i).getCodeDpt()+";"+mesCommunes.get(i).getNomRegion()+";"
                        +mesCommunes.get(i).getPopTotale();
                lines.add(lignefichier);
            }

        }
        Path pathCible = Paths.get("C:/Users/jbrou/Desktop/Perso/Formation/DIGINAMIC/Cours/"
                + "07 - Java approche POO/TP/recensement_25K.csv");

        //Création fichier + écriture

        Files.write(pathCible,lines);







    }
}
