package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * lisez le contenu du fichier et affichez son contenu
 */
public class CreerFichier {

    public static void main(String[] args) throws IOException {
        //Création d'une liste de String depuis le contenu du fichier d'origine
        Path pathRoot = Paths.get(
                "C:/Users/jbrou/Desktop/Perso/Formation/DIGINAMIC/Cours/07 - Java approche POO/TP/recensement.csv");

        List<String> lignesDepart = Files.readAllLines(pathRoot);
        //Création d'une liste de String qui conrespondra au fichier de sortie --> actuellement vide
        ArrayList<String>lignesSortie = new ArrayList<>();
        //Alimentation de la liste de sortie
        for (int i = 1; i <101 ; i++) {
            lignesSortie.add(lignesDepart.get(i) );
        }
        // difinition du chemin du futur fichier
        Path pathCible = Paths.get("C:/Users/jbrou/Desktop/Perso/Formation/DIGINAMIC/Cours/"
                + "07 - Java approche POO/TP/recensement_100.csv");
        //Ecriture du futur fichier
        Files.write(pathCible,lignesSortie);
        //
    }

}
