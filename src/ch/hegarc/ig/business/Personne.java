package ch.hegarc.ig.business;

import ch.hegarc.ig.edulearn.EduLearn;

import java.util.ArrayList;
import java.util.List;

public abstract class Personne {
    private String nom;
    private String prenom;
    private String matricule;
    private Formation formation;
    private List<Cours> coursSuivis;

    public Personne(String nom, String prenom, String matricule, Formation formation) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.formation = formation;
        this.coursSuivis = coursSuivis;
        List<Cours> coursSuivis = new ArrayList<>();
        this.coursSuivis = coursSuivis;
    }

    public Personne(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.coursSuivis = new ArrayList<>();
    }

    public Personne() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public List<Cours> getCoursSuivis() {
        return coursSuivis;
    }

    public void setCoursSuivis(Cours coursSuivis) {
        this.coursSuivis.add(coursSuivis);
        //coursSuivis.setListeApprenants();
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
