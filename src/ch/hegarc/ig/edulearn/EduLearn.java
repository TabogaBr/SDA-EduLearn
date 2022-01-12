package ch.hegarc.ig.edulearn;

import ch.hegarc.ig.business.*;

import java.util.*;

public class EduLearn implements IEduLearn {

    private Map<String, Personne> users;
    private Map<String, Cours> cours;
    List<Apprenant> apprenants = new ArrayList<>();
    List<Document> documents = new ArrayList<>();

    @Override
    public boolean supprimerDeListe(String matricule) {
        for (int i = 0; i < apprenants.size(); i++){
            if (apprenants.get(i).getMatricule().equals(matricule)){
                apprenants.remove(i);
                return true;
            }else {
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean ajouterDocument(Cours cours, Document docu, Chapitre chap) {
        if (cours != null){
            if (chap != null){
                documents.add(docu);
                return true;
            }else {
                System.out.println("Le chapitre souhaité n'existe pas...");

                return false;
            }
        }else {
            System.out.println("Le cours souhaité n'existe pas");

            return false;
        }
    }

    public EduLearn() {
        this.createUsers();
    }

    private void createUsers() {
        Personne pers1 = new Enseignant("Matis", "Dup");
        users = new HashMap<>();
        users.put(pers1.getNom(), pers1);
    }

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
    public boolean creerCours(String nom, Matiere matière, String commentaire, Enseignant proprietaire){
        Cours cours = new Cours(nom,matière,commentaire,proprietaire);
        int numero = cours.getNumeroUnique();
        cours.setId(numero);


        List<Apprenant> apprenants = new ArrayList<>();
        cours.setListeApprenants(apprenants);

        List<String> fichiers = new ArrayList<>();
        cours.setListeFichiersAccessibles(fichiers);
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
        cours.getProprietaire().getCoursDonnes().remove(cours);
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


    public boolean validerInscription (Apprenant apprenant, Cours cours) {
        return cours.getListeApprenants().stream().anyMatch(apprenant1 -> apprenant1.getMatricule() == apprenant.getMatricule());
        // Check dans la liste d'apprenant pour le cours donner en paramètre si l'apprenant est dans la liste
        // Apprenant1 est l'element qui sera tester/controler
        // Stream traite une collection d'objet
    }

    /**
     * Fonction qui sert a recuperer les fichiers d'un cours
     * @param cours
     * @return Liste des fichiers ou null si vide
     */
    public List<String> downloadFichier (Cours cours) {
        List<String> fichierDispo = cours.getListeFichiersAccessibles();
        if (fichierDispo.isEmpty()) {
            return null;
        } else {
            return fichierDispo;
        }
    }
}
