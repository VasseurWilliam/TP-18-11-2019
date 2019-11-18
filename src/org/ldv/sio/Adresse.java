package org.ldv.sio;

import java.util.Objects;

public class Adresse extends AdresseEtendue{
    private String rue;
    private String ville;
    private String codePostal;

    public Adresse(String url, String email) {
        super(url, email);
    }

    public Adresse( String rue, String ville, String codePostal, String url, String email) {
        super(url, email);
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public Adresse( String rue, String ville, String codePostal) {
        super("", "");
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }
    public Adresse( String rue, String ville, String codePostal, String mail) {
        super("", mail);
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }




    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "rue='" + rue + '\'' +
                ", ville='" + ville + '\'' +
                ", codePostal='" + codePostal + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresse adresse = (Adresse) o;
        return Objects.equals(rue, adresse.rue) &&
                Objects.equals(ville, adresse.ville) &&
                Objects.equals(codePostal, adresse.codePostal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rue, ville, codePostal);
    }
}
