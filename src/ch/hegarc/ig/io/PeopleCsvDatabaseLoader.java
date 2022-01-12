package ch.hegarc.ig.io;

import ch.hegarc.ig.business.Apprenant;
import ch.hegarc.ig.business.Personne;

import java.util.ArrayList;
import java.util.List;
import static ch.hegarc.ig.io.PersonneDatabaseUtils.findColumnIndex;

public class PeopleCsvDatabaseLoader extends PeopleDatabaseLoader {

    /**
     * Input
     * @param filepath Full path of the file that will be loaded.
     */
    public PeopleCsvDatabaseLoader(final String filepath){
        super(filepath);
    }

    public void process() {
        this.personnes = loadCleanDatabase(filepath);
    }

    /**
     * Load a clean database into a List<String[]>.
     * @param filename Document database filepath.
     */
    private List<Personne> loadCleanDatabase(final String filename){
        List<String[]> personnes = ParserUtils.parseCSV(filename);
        return parsePeopleDatabase(personnes);
    }

    /**
     * Parse a cleaned documents database.
     * Use Pattern.quote to parse "|" character.
     * @param loadedPeople Cleaned documents database.
     * @return List of documents.
     */
    private List<Personne> parsePeopleDatabase(List<String[]> loadedPeople){

        int nomColumnIndex = findColumnIndex(loadedPeople.get(0), PeopleDatabaseConstant.NOM.getColumnName());
        int prenomColumnIndex = findColumnIndex(loadedPeople.get(0), PeopleDatabaseConstant.PRENOM.getColumnName());
        int matriculeColumnIndex = findColumnIndex(loadedPeople.get(0), PeopleDatabaseConstant.MATRICULE.getColumnName());
        int notFoundColumnIndex = -1;

        int startIndex = 1; // Skip header

        // The size is known in advance, prevent array list unnecessary grow
        List<Personne> personnes = new ArrayList<>(loadedPeople.size()-1);

        for (int i = startIndex; i < loadedPeople.size(); i++) {

            Personne personne = new Apprenant();

            if(nomColumnIndex != notFoundColumnIndex) {
                personne.setNom(loadedPeople.get(i)[nomColumnIndex]);
            }

            if(matriculeColumnIndex != notFoundColumnIndex) {
                personne.setPrenom(loadedPeople.get(i)[matriculeColumnIndex]);
            }

            if(matriculeColumnIndex != notFoundColumnIndex) {
                personne.setMatricule(loadedPeople.get(i)[matriculeColumnIndex]);
            }

            personnes.add(personne);
        }

        return personnes;
    }

}
