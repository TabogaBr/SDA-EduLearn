package ch.hegarc.ig.business;

public class Formation {
    private int niveau;
    private String ecole;
    private String certificat;

    public Formation(int niveau, String ecole, String certificat) {
        this.niveau = niveau;
        this.ecole = ecole;
        this.certificat = certificat;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public String getCertificat() {
        return certificat;
    }

    public void setCertificat(String certificat) {
        this.certificat = certificat;
    }
}
