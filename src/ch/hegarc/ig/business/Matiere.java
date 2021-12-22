package ch.hegarc.ig.business;

public class Matiere {
    private String nom;
    private int niveau;

    public Matiere(String matière, int niveau) {
        this.nom = matière;
        this.niveau = niveau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String matière) {
        this.nom = matière;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
}
