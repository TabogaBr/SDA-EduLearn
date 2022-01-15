package ch.hegarc.ig.utils;

import ch.hegarc.ig.business.Personne;
import java.util.Comparator;

public class CompareNomPrenom implements Comparator<Personne> {
    @Override
    public int compare(Personne o1, Personne o2) {
        String nom1 = ((Personne) o1).getNom();
        String nom2 = ((Personne) o2).getNom();
        
        int res = nom1.compareTo(nom2);
        if (res != 0) {
            return res;
        } else {
            String prenom1 = ((Personne) o1).getPrenom();
            String prenom2 = ((Personne) o2).getPrenom();
            return prenom1.compareTo(prenom2);
        }
    }
}
