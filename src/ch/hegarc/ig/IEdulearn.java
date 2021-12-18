package ch.hegarc.ig;

import ch.hegarc.ig.business.Chapitre;
import ch.hegarc.ig.business.Cours;
import ch.hegarc.ig.business.Document;

public interface IEdulearn {
    boolean supprimerDeListe(String matricule);

    boolean ajouterDocument(Cours cours, Document docu, Chapitre chap);
}
