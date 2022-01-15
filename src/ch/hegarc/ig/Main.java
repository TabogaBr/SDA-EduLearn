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

        // tests pour 10000 personnes
        List<Personne> listeTemp10000;
        listeTemp10000 = Main.loadPeople("C:\\Users\\brenda.taboga\\Documents\\SDA_StructuresDonneesAvancees\\SDA-EduLearn\\data\\people.nomPrenomMatricule10000.csv");

        for (Personne p : listeTemp10000) {
            eduLearn.obtenirTousLesUtilisateurs().put(p.getMatricule(), p);
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

    public static void elapsedTimeSortPersonneCours(EduLearn eduLearn, Cours cours, Personne proprietaire, String message) {
        long startTime= System.currentTimeMillis();
        List<Personne> test = eduLearn.triPersonnesDansCours(cours, proprietaire);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Calculation finishe + " + "Number of person: " + message);
        System.out.println("Duration Millis : " + elapsedTime + " ms");
    }
    public static void elapsedTimeAuthentification(EduLearn edu, String username, String message) {
        long startTime= System.nanoTime();
        System.out.println(edu.authentification(username, "PASSWORD"));
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Calculation finished." + " Number of person: " + message);
        System.out.println("Duration Nano : " + elapsedTime + " nano");
    }
}
