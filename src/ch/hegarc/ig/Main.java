package ch.hegarc.ig;

import ch.hegarc.ig.business.*;
import ch.hegarc.ig.edulearn.EduLearn;
import ch.hegarc.ig.edulearn.IEduLearn;
import ch.hegarc.ig.io.PeopleCsvDatabaseLoader;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IEduLearn eduLearn = new EduLearn();

        /*Personne connectedUser = eduLearn.authentification("Matis", "Dup");
        System.out.println(connectedUser);*/

        /*Apprenant apprenant1 = new Apprenant("Brenda", "Taboga");

        Cours c1 = new Cours();
        c1.setNom("Tute");
        apprenant1.setCoursSuivis(c1);
        System.out.println(apprenant1.getCoursSuivis().toString());

        eduLearn.quitterCours(apprenant1, c1);


        //création de l'apprenant, de l'enseignant, de sa matière, de son cours et de sa formation
        Apprenant apprenant2 = new Apprenant("Brenda", "Taboga");
        Formation formation1 = new Formation(4,"Harvard", "monCertif");
        Enseignant enseignant1 = new Enseignant("Neels", "Niklas", "NN",formation1);
        Matiere matiere1 = new Matiere("Programmation", 3);
        Cours cours1 = new Cours("Architecture de données",matiere1,"prérequis : avoir des notions de base de programmation",enseignant1);

        //ajout d'un cours à l'apprenant
        apprenant1.setCoursSuivis(cours1);

        System.out.println(apprenant1.getCoursSuivis().toString());

        //tentative d'une création de cours de manière plus efficace
        //eduLearn.creerCours("Architecture de données",matiere1,"prérequis : avoir des notions de base de programmation",enseignant1);
        eduLearn.quitterCours(apprenant1,cours1);

        System.out.println(apprenant1.getCoursSuivis().toString());

        System.out.println(enseignant1.toString());
        System.out.println(apprenant1.getCoursSuivis().toString());*/

        List<Personne> listeTemp = new ArrayList<>();
        listeTemp = Main.loadPeople("C:\\Users\\brenda.taboga\\Documents\\SDA_StructuresDonneesAvancees\\SDA-EduLearn\\data\\people.nomPrenomMatricule10000.csv");

        for (Personne p : listeTemp) {
            eduLearn.getUsers().put(p.getMatricule(), p);
        }

        System.out.println(eduLearn.getUsers());
    }

    public static List<Personne> loadPeople(String filepath) {
        PeopleCsvDatabaseLoader loader = new PeopleCsvDatabaseLoader(filepath);
        loader.process();
        List<Personne> personnes = new ArrayList<>();
        personnes = loader.getPersonnes();
        return personnes;
    }
}
