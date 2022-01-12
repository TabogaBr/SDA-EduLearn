package ch.hegarc.ig.edulearn;

import ch.hegarc.ig.business.*;

import java.util.List;
import java.util.Map;

public interface IEduLearn {

    Personne authentification(String username, String pwd);

    boolean creerCours(String nom, Matiere matière, String commentaire, Enseignant proprietaire);

    boolean quitterCours(Apprenant apprenant, Cours cours);

    List<Apprenant> consulterListeClasse(Enseignant enseignant, Cours cours);

    Map<String, Personne> getUsers();
}
