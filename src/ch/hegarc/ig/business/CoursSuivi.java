package ch.hegarc.ig.business;

import java.util.List;

public final class CoursSuivi extends Cours{

    public CoursSuivi(CoursDonne coursD) {
        id = coursD.getId();
        nom = coursD.getNom();
        matiere = coursD.getMatiere();
        commentaire = coursD.getCommentaire();
        listeFichiersAccessibles = coursD.getListeFichiersAccessibles();
    }
}
