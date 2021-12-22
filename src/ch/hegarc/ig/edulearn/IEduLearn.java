package ch.hegarc.ig.edulearn;

import ch.hegarc.ig.business.*;

import java.util.List;

public interface IEduLearn {

    Personne authentification(String username, String pwd);

    boolean creerCours(String nom, Matiere matière, String commentaire, Enseignant proprietaire);

    boolean quitterCours(Apprenant apprenant, Cours cours);

    List<Apprenant> consulterListeClasse(Enseignant enseignant, Cours cours);
    
    boolean supprimerDeListe(String matricule);

    boolean ajouterDocument(Cours cours, Document docu, Chapitre chap);
}
