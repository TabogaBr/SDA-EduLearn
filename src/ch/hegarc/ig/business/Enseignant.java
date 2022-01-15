package ch.hegarc.ig.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Enseignant extends Personne {
    private List<Cours> coursDonnes;

    public Enseignant() {
        this.coursDonnes = new ArrayList<>();
    }

    public Enseignant(String nom, String prenom, String matricule, Formation formation){
        super(nom, prenom, matricule, formation);
        List<Cours> coursDonnes = new ArrayList<>();
        this.coursDonnes = coursDonnes;
    }

    public Enseignant(String nom, String prenom, String matricule) {
        super(nom, prenom, matricule);
    }

    public List<Cours> getCoursDonnes() {
        return coursDonnes;
    }

    public void setCoursDonnes(List<Cours> coursDonnes) {
        this.coursDonnes = coursDonnes;
    }

    public void addCours(Cours cours) {
        this.coursDonnes.add(cours);
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "coursDonnes=" + super.toString() + "}";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
