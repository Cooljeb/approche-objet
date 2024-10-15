package fr.diginamic.recensement.data;

/**
 * Classe région
 */
public class Region {
    // variables d'instance
    private int codeRegion; // code de la régiono
    private String nomRegion; // nom de la région

    //constructeurs de la classe avec soit codeRegion ou nomRegion en paramètre ou les 2

    public Region(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public Region(int codeRegion) {
        this.codeRegion = codeRegion;
    }

    public Region(Integer codeRegion, String nomRegion) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
    }

    //getters

    public int getCodeRegion() {
        return codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    @Override public String toString() {
        return  codeRegion + nomRegion;
    }
}
