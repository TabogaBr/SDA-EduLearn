package ch.hegarc.ig.business;

import java.util.List;

public abstract class Cours {
    int id;
    String nom;
    String matiere;
    String commentaire;
    List<String> listeFichiersAccessibles;

    public int getId(){
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getMatiere() {
        return matiere;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public List<String> getListeFichiersAccessibles() {
        return listeFichiersAccessibles;
    }
}
