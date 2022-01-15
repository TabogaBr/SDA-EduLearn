package ch.hegarc.ig.edulearn;

import ch.hegarc.ig.business.*;
import ch.hegarc.ig.utils.CompareNomPrenom;

import java.util.*;

public class EduLearn implements IEduLearn {

    private Map<String, Personne> users;
    private Map<Integer, Cours> cours;

    public EduLearn() {
        this.users = new HashMap<>();
        this.cours = new HashMap<>();
    }
    /**
     *
     * @return La liste complète des cours de l'objet EduLearn
     */
    @Override
    public Map<Integer, Cours> obtenirTousLesCours() {
        return this.cours;
    }

    /**
     *
     * @return La liste complète des utilisateurs de l'objet EduLearn
     */
    @Override
    public Map<String, Personne> obtenirTousLesUtilisateurs() {
        return this.users;
    }

    /**
     * Vérifie que l'utilisateur correspond bien au username et password
     * @param username
     * @param pwd
     * @return l'objet personne authentifié
     */
    @Override
    public Personne authentification(String username, String pwd) {
        Personne personne = this.users.get(username);
        if (personne.getPrenom().equals(pwd)) {
            return personne;
        }
        return null;
    }

    // essai de faire "un constructeur" avec un identifiant unique

    @Override
    public boolean creerCours(String nom, Matiere matiere, String commentaire, Enseignant proprietaire) {
        Cours cours = new Cours(nom, matiere, commentaire, proprietaire);
        int numero = cours.getNumeroUnique();
        cours.setId(numero);

        List<Personne> apprenants = new ArrayList<>();
        cours.setListePersonne(apprenants);

        List<String> fichiers = new ArrayList<>();
        cours.setListeFichiersAccessibles(fichiers);

        this.cours.put(numero, cours);
        return true;
    }

    /**
     * Permet à un apprenant de quitter le cours souhaité (ne permet pas à un enseignant de supprimer un élève).
     * Cela supprimera le cours de la liste des cours de l'apprenant.
     * L'apprenant sera supprimé de la liste des apprenants du cours.
     *
     * @param apprenant
     * @param cours
     * @return true si l'apprenant a pu quitter le cours, false s'il y a eu un problème.
     */

    @Override
    public boolean quitterCours(Apprenant apprenant, Cours cours) {
        // redéfinition de la méthode equals() de la classe Cours
        // modification de la classe Cours, il faut qu'un cours connaisse l'enseignant propriétaire
        int index = apprenant.getCoursSuivis().indexOf(cours);
        if (index == -1) {
            return false;
        }
        apprenant.getCoursSuivis().remove(index);
        return true;
    }

    /**
     * Permet à un enseignant d'avoir une liste des apprenants inscrits à un de ses cours.
     *
     * @param enseignant
     * @param cours
     * @return la liste des apprenants d'un cours d'un enseignant, null si le cours n'existe pas dans la liste de cours de l'enseignant.
     */
    @Override
    public List<Apprenant> consulterListeClasse(Enseignant enseignant, Cours cours) {
        // modification de la classe Cours, il faut qu'un cours ait une liste d'apprenants pour cette méthode (sinon vraiment vraiment pas opti)
        for (Cours c : enseignant.getCoursDonnes()) {
            if (cours.equals(c)) {
                return c.getListeApprenants();
            }
        }
        return null;
    }
}
