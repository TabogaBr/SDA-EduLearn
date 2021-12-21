package ch.hegarc.ig.edulearn;

import ch.hegarc.ig.business.Apprenant;
import ch.hegarc.ig.business.Cours;
import ch.hegarc.ig.business.Enseignant;
import ch.hegarc.ig.business.Personne;

import java.util.List;

public interface IEduLearn {

    Personne authentification(String username, String pwd);

    //boolean creerCours();

    boolean quitterCours(Apprenant apprenant, Cours cours);

    List<Apprenant> consulterListeClasse(Enseignant enseignant, Cours cours);
}
