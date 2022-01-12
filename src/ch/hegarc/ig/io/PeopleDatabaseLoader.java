package ch.hegarc.ig.io;

import ch.hegarc.ig.business.Personne;

import java.util.List;

public abstract class PeopleDatabaseLoader {

    protected String filepath;

    protected List<Personne> personnes;

    public PeopleDatabaseLoader(String filepath) {
        this.filepath = filepath;
    }

    public String getFilepath() {
        return filepath;
    }

    public List<Personne> getPersonnes() {
        return personnes;
    }

}
