package ch.hegarc.ig.business;

import java.util.List;

public class CoursDonne extends Cours {

    public CoursDonne(int id, String nom, String matiere, String commentaire, List<String> listeFichiersAccessibles) {
        this.id = id;
        this.nom = nom;
        this.matiere = matiere;
        this.commentaire = commentaire;
        this.listeFichiersAccessibles = listeFichiersAccessibles;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public void setListeFichiersAccessibles(List<String> listeFichiersAccessibles) {
        this.listeFichiersAccessibles = listeFichiersAccessibles;
    }
}
