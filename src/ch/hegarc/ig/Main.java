package ch.hegarc.ig;

import ch.hegarc.ig.business.CoursDonne;
import ch.hegarc.ig.business.CoursSuivi;
import ch.hegarc.ig.business.Etudiant;

public class Main {

    public static void main(String[] args) {
        CoursDonne anglais = new CoursDonne(1,"ANG1","Anglais","Voici le cours d'anglais 1",null);
        CoursSuivi anglais_public = new CoursSuivi(anglais);

        Etudiant e1 = new Etudiant("Allemano","Enzo","NE7",null,null);
        e1.setCoursSuivis(anglais_public);
    }
}
