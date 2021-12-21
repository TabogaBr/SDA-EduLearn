package ch.hegarc.ig.business;

import java.util.List;

public class Enseignant extends Personne {
    private List<Cours> coursDonnes;

    public Enseignant(String nom, String prenom, String matricule, Formation formation, List<Cours> coursSuivis,
                      List<Cours> coursDonnes) {
        super(nom, prenom, matricule, formation, coursSuivis);
        this.coursDonnes = coursDonnes;
    }

    public Enseignant(String nom, String prenom) {
        super(nom, prenom);
    }

    public List<Cours> getCoursDonnes() {
        return coursDonnes;
    }

    public void setCoursDonnes(List<Cours> coursDonnes) {
        this.coursDonnes = coursDonnes;
    }
}
