package fr.diginamic.recensement.data;

import fr.diginamic.fichier.Commune;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Recensement  {

    //Création d'un arrayListe de ville vide
    private ArrayList<Ville> mesVilles = new ArrayList<>();

    //Path du fichier d'origine
    private final Path PATH_FILE = Paths.get("C:/Users/jbrou/Desktop/Perso/Formation/DIGINAMIC/Cours/07 - Java approche POO/TP/recensement.csv");
    //Lecture du fichier et ajout des données dans un List nommée lignesFichier
    List<String> lignesFichier = Files.readAllLines(PATH_FILE, StandardCharsets.UTF_8); // liste contenant toutes les lignes du csv

    public Recensement() throws IOException {
        chargerVille();
    }
    // getters
    public ArrayList<Ville> getMesCommunes() {
        return mesVilles;
    }

    //remplissage du tableau de villes via la méthiode chargerVille appliquée dans le constructeur
    public void chargerVille(){

        for (int i = 1; i < lignesFichier.size(); i++) {

            String[] tokens  = lignesFichier.get(i).split(";");
            Region r = new Region (Integer.parseInt(tokens[0].replaceAll(" ","")),tokens[1]);
            Departement codeDpt =new Departement(tokens[2].replaceAll(" ",""));
            int codeC = Integer.parseInt(tokens[5].replaceAll(" ", ""));
            String nomC = tokens[6];
            int popTotale = Integer.parseInt(tokens[9].replaceAll(" ",""));
            // Commune(String nom, int codeDpt, String nomRegion, int popTotale)
            mesVilles.add(new Ville(r,codeDpt,codeC,nomC,popTotale));
        }
    }


}
