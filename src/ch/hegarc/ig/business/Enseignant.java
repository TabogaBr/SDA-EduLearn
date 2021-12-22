package ch.hegarc.ig.business;

import java.util.ArrayList;
import java.util.List;

public class Enseignant extends Personne {
    private List<Cours> coursDonnes;

    public Enseignant(String nom, String prenom, String matricule, Formation formation){
        super(nom, prenom, matricule, formation);
        List<Cours> coursDonnes = new ArrayList<>();
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

    @Override
    public String toString() {
        return "Enseignant{" +
                "coursDonnes=" + coursDonnes +
                '}';
    }
}
