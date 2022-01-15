package ch.hegarc.ig.business;

import java.util.List;
import java.util.Objects;

public class Chapitre {
    private String nom;
    private List<Document> documents;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocument(Document document) {
        this.documents.add(document);
    }

    public int getIndexDocument(Document doc){
        for (int i = 0; i < this.documents.size(); i++) {
            if (this.documents.get(i).equals(doc))
                return i;
        }
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chapitre chapitre = (Chapitre) o;
        return Objects.equals(nom, chapitre.nom) && Objects.equals(documents, chapitre.documents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, documents);
    }
}
