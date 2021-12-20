package ch.hegarc.ig.business;

import java.util.List;
import java.util.Objects;

public class Cours {
    private int id;
    private String nom;
    private String matiere;
    private String commentaire;
    private Enseignant proprietaire;
    private List<Apprenant> listeApprenants;
    private List<String> listeFichiersAccessibles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Enseignant getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Enseignant proprietaire) {
        this.proprietaire = proprietaire;
    }

    public List<Apprenant> getListeApprenants() {
        return listeApprenants;
    }

    public void setListeApprenants(List<Apprenant> listeApprenants) {
        this.listeApprenants = listeApprenants;
    }

    public List<String> getListeFichiersAccessibles() {
        return listeFichiersAccessibles;
    }

    public void setListeFichiersAccessibles(List<String> listeFichiersAccessibles) {
        this.listeFichiersAccessibles = listeFichiersAccessibles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cours cours = (Cours) o;
        return id == cours.id && Objects.equals(nom, cours.nom) && Objects.equals(matiere, cours.matiere) && Objects.equals(commentaire, cours.commentaire) && Objects.equals(listeFichiersAccessibles, cours.listeFichiersAccessibles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, matiere, commentaire, listeFichiersAccessibles);
    }

    @Override
    public String toString() {
        return "Cours{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", matiere='" + matiere + '\'' +
                ", commentaire='" + commentaire + '\'' +
                ", proprietaire=" + proprietaire +
                ", listeApprenants=" + listeApprenants +
                ", listeFichiersAccessibles=" + listeFichiersAccessibles +
                '}';
    }
}
