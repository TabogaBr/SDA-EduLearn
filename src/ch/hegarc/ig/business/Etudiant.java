package ch.hegarc.ig.business;

import java.util.List;

public class Etudiant extends Personne{

    public Etudiant(String nom, String prenom, String matricule, Formation formation, List<CoursSuivi> coursSuivis) {
        super(nom, prenom, matricule, formation, coursSuivis);
    }
}
