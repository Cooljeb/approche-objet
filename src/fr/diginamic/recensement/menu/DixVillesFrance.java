package fr.diginamic.recensement.menu;

import fr.diginamic.recensement.data.Recensement;
import fr.diginamic.recensement.data.comparateurs.ComparatorHabitants;

import java.util.*;

public class DixVillesFrance {

    //constructeur

    public DixVillesFrance() {
    }

    public void traiter(Recensement recensement, Scanner scanner) {
//        scanner = new Scanner(System.in);
//        scanner.close();
        System.out.println("\nAffichage des 10 villes les plus peuplées de France !\n");
        HashMap<String,Integer> villesFrance = new HashMap<>();
        for (int i = 0; i < recensement.getMesCommunes().size(); i++) {
            Ajouter(recensement,i,villesFrance);
        }
        // Trier la MAP par clé valeur
        //System.out.println(villesDepartement);
        triMap(villesFrance);

    }

    /**
     * <p>Méhode de regroupement du nombre d'habitants par région
     * si le nom de région interrogé existe de le map on ajout le nombre d'habitans interrogé à celui de la valeur
     * clé actuelle, pouis on remplace le nombre d'ahotants dans la valeur.</p>
     * <b>Le nom de région est remplacé bien qu'il ne soit pas modifié</b>
     *
     * <p>Dans le cas contraire si la région n'est pas connue, on ajoute la valeur clé-valeur dans la map</p>
     * @param r //recensement
     * @param c //compteur,
     * @param rp //Hasmpap "Nom de region, nombre d'habitants"
     */
    void Ajouter(Recensement r, int c,HashMap<String,Integer> rp){

        //String nomR = re.;
        String nomVille =  r.getMesCommunes().get(c).getNomCommune();
        //boolean siExiste = rp.containsKey(cdDepartement);
        //int nombreHab;

            rp.put(nomVille,r.getMesCommunes().get(c).getPopTotale());




    }
    /**
     *<p>Cette méthide permetde trier la map et d'afficher le contenu</p>
     * <p>on affecte les valeurs du Hashmap passé en paramètre à notre classe de tri ({@link ComparatorHabitants})<p/>
     * <p>Puis ces valeurs <b>triées</b> sont affectées à un TreeMap (le rangement dans ce map est simplifié) </p>
     * <p>On fait appel aux objets Set et Iterator pour récupérer les clés du Treemap</p>
     * <p>On veut ici afficher que les 10ères régions qui ont le plus d'habitans (soit les 10 premières entrées du tree)
     * <p/>
     * <p>on boucle, en créant à chaque valeur un MAP.Entry, qui nous permet de récupérer le couple clé-valeur d'un
     * élément du tree, ce qui nous permet dans l'affichage de formater de la sorte Clé - Valeur
     *  en utilisant les méthodes get.Key() et get.Value() </p>
     * @param rp
     */
    void  triMap(HashMap<String,Integer> rp){
        // Tri des vvaleurs dans l'ordre croissant
        ComparatorHabitants comparatorHabitants = new ComparatorHabitants(rp);
        TreeMap<String,Integer> maptri= new TreeMap<>(comparatorHabitants); //affectation des valeurs
        maptri.putAll(rp);//affectation des valeurs de rp triées, dans
        final int COMPTEUR =10;
        Set set = maptri.entrySet(); // récuprère la liste des clés
        Iterator i = set.iterator(); // Itérateir
        int j=1;
        while(i.hasNext()&&(j<=COMPTEUR)){ // tant qu'il ya une clé suivante existante et que j<>COMPTEUR, on boucle
            Map.Entry m = (Map.Entry)i.next(); // on va chercher la valeur suivante
            System.out.println(+j+") "+m.getKey()+"|"+m.getValue()+" habitants");
            j++;
        }
    }
}
