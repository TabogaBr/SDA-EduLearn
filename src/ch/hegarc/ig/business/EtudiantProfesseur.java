package ch.hegarc.ig.business;

import java.util.List;

public class EtudiantProfesseur extends Personne {
    private List<CoursDonne> coursDonnes;

    public EtudiantProfesseur(String nom, String prenom, String matricule, Formation formation, List<CoursSuivi> coursSuivis) {
        super(nom, prenom, matricule, formation, coursSuivis);
    }
}
