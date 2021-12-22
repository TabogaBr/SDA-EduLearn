package ch.hegarc.ig;

import ch.hegarc.ig.business.Apprenant;
import ch.hegarc.ig.business.Chapitre;
import ch.hegarc.ig.business.Cours;
import ch.hegarc.ig.business.Document;

import java.util.ArrayList;
import java.util.List;

public class Edulearn implements IEdulearn{
    List<Apprenant> apprenants = new ArrayList<>();
    List<Document> documents = new ArrayList<>();

    @Override
    public boolean supprimerDeListe(String matricule) {
        for (int i = 0; i <= apprenants.size(); i++){
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
}
