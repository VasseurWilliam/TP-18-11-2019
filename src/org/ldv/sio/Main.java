package org.ldv.sio;

public class Main {

  public static void main(String[] args) {
    Adresse d = new Adresse("3 rue du clocher", "Melun" , "77000");
    Adresse l = new Adresse("2 rue du cimetière", "Paris", "75001");
    Client client = new Client("Dijkstra", "Kernighan", d);
    client.addLivraison(l);


    Adresse livraison = new Adresse("2 rue du cimetière", "Paris", "75001");
    Adresse livraison1 = new Adresse("1 rue du cinema", "Marseille", "13001");

    Client client1 = new Client("Kernighan", "prenom", d);
    client1.addLivraison(livraison);
    client1.addLivraison(livraison1);


    Adresse adresse = new Adresse("3 rue du clocher", "Melun", "77000", "edsger@dijstra.org");
    Adresse adresse1 = new Adresse("ruebidon", "villebidon", "00000");
    Client client3 = new Client("william", "vasseur", adresse);
    client3.addLivraison(adresse1);

    System.out.println("nom=" + client3.getNom() + ", rue="+ client3.getDomicile().getRue() + ", codePostal= " + client3.getDomicile().getCodePostal() + ", ville= " + client3.getDomicile().getVille()
    + ", email= " + client3.getDomicile().getEmail());
    System.out.println("livraison 1 adresse : rue=" + client3.getLivraison(0).getRue() + ", codePostal= " + client3.getLivraison(0).getCodePostal() + ", ville= " + client3.getLivraison(0).getVille());
    System.out.println("livraison 2 adresse : rue=" + client3.getLivraison(1).getRue() + ", codePostal= " + client3.getLivraison(1).getCodePostal() + ", ville= " + client3.getLivraison(1).getVille());

    //System.out.println("nom=" + client1.getNom() + ",  rue=" + client1.getLivraison(1).getRue()  + ",  codePostal=" + client1.getLivraison(1).getCodePostal() + ",  ville=" + client1.getLivraison(1).getVille());
    //System.out.println("nom=" + client1.getNom() + ",  rue=" + client1.getLivraison(2).getRue()  + ",  codePostal=" + client1.getLivraison(2).getCodePostal() + ",  ville=" + client1.getLivraison(2).getVille());



  }
}
