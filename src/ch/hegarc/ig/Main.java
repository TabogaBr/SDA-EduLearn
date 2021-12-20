package ch.hegarc.ig;

import ch.hegarc.ig.business.Apprenant;
import ch.hegarc.ig.business.Cours;
import ch.hegarc.ig.business.Personne;
import ch.hegarc.ig.edulearn.EduLearn;
import ch.hegarc.ig.edulearn.IEduLearn;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        IEduLearn eduLearn = new EduLearn();

        /*Personne connectedUser = eduLearn.authentification("Matis", "Dup");
        System.out.println(connectedUser);*/

        Apprenant apprenant1 = new Apprenant("Brenda", "Taboga");

        Cours c1 = new Cours();
        c1.setNom("Tute");
        apprenant1.setCoursSuivis(c1);
        System.out.println(apprenant1.getCoursSuivis().toString());

        eduLearn.quitterCours(apprenant1, c1);

        System.out.println(apprenant1.getCoursSuivis().toString());
    }
}
