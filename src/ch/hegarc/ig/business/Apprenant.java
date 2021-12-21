package ch.hegarc.ig.business;

import java.util.List;

public class Apprenant extends Personne{

    public Apprenant(String nom, String prenom) {
        super(nom, prenom);
    }

    public Apprenant(String nom, String prenom, String matricule, Formation formation, List<Cours> coursSuivis) {
        super(nom, prenom, matricule, formation, coursSuivis);
    }
}
