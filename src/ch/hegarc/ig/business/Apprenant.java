package ch.hegarc.ig.business;

import java.util.List;

public class Apprenant extends Personne{
    public Apprenant() {
    }

    public Apprenant(String nom, String prenom, String matricule) {
        super(nom, prenom, matricule);
    }

    public Apprenant(String nom, String prenom, String matricule, Formation formation, List<Cours> coursSuivis) {
        super(nom, prenom, matricule, formation);
    }
}
