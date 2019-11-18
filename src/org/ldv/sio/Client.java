package org.ldv.sio;

import java.util.Objects;

public class Client {
    private String nom;
    private String prenom;
    private Adresse domicile;
    private Adresse[] livraison = new Adresse[10];

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Client(String nom, String prenom, Adresse domicile) {
        this.nom = nom;
        this.prenom = prenom;
        this.domicile = domicile;
        this.livraison[0] = domicile;
    }

    public Client(String nom, String prenom, Adresse domicile, Adresse livraison) {
        this.nom = nom;
        this.prenom = prenom;
        this.domicile = domicile;
        this.livraison[0] = livraison;

    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getDomicile() { return domicile; }

    public void setDomicile(Adresse domicile) { this.domicile = domicile; }

    public Adresse getLivraison(int i) { return livraison[i]; }

    public void setLivraison(Adresse livraison, int i ) { this.livraison[i] = livraison; }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", domicile=" + domicile +
                ", livraison=" + livraison +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(nom, client.nom) &&
                Objects.equals(prenom, client.prenom) &&
                Objects.equals(domicile, client.domicile) &&
                Objects.equals(livraison, client.livraison);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, domicile, livraison);
    }

    public void addLivraison(Adresse ad){
        int i;

        for( i = 0 ; i< this.livraison.length ; i++){
            if(this.livraison[i] == null){
                break;
            }
        }
        this.livraison[i] = ad;
    }
}
