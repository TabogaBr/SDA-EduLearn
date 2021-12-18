package ch.hegarc.ig;

import ch.hegarc.ig.business.Chapitre;
import ch.hegarc.ig.business.Cours;
import ch.hegarc.ig.business.Document;

public class Edulearn implements IEdulearn{
    @Override
    public boolean supprimerDeListe(String matricule) {
        return false;
    }

    @Override
    public boolean ajouterDocument(Cours cours, Document docu, Chapitre chap) {
        return false;
    }
}
