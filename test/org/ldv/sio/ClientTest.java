package org.ldv.sio;

import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class ClientTest {

  private Client c;
  private Client c1;
  private Client c2;
  private Adresse d;
  private Adresse l;
  private Adresse adresse;

  @Before
  public void initializeEachTest() {
    this.d = new Adresse("2 rue de la femme", "Paris" , "75002");
    this.l = new Adresse("3 rue de l'homme", "Paris", "75003");
    this.adresse = new Adresse("3 rue du clocher", "Melun", "77000", "https://fr.wikipedia.org/wiki/Edsger_Dijkstra", "edsger@dijstra.org");
    this.c = new Client("Dijkstra", "Edsger", d);
    this.c1 = new Client("Toca", "Yacine", d, l);
    this.c2 = new Client("Dijkstra", "Edsger", adresse);

  }

  @Test
  public void getNom() {

    //assertEquals("Dijkstra", this.c.getNom());
    this.c.getNom().equals("Dijkstra");
  }

  @Test
  public void setNom() {
    this.c.setNom(this.c.getNom().toUpperCase());
    //assertEquals("DIJKSTRA", this.c.getNom());
    this.c.getNom().equals("DIJKSTRA");
  }

  @Test
  public void getPrenom() {
    //assertEquals("Edsger", this.c.getPrenom());
    this.c.getPrenom().equals("Edsger");
  }

  @Test
  public void setPrenom() {
    this.c.setPrenom(this.c.getPrenom().toUpperCase());
    //assertEquals("EDSGER", this.c.getPrenom());
    this.c.getPrenom().equals("EDSGER");

  }

  @Test
  public void verifDomicileEgalLivraison (){
   // assertEquals(d, this.c.getLivraison());
    this.c.getLivraison(0).equals(d);
  }

  @Test
  public void verifDomicileDiffLivraison(){
    //assertEquals(d, this.c1.getDomicile());
    //assertEquals(l, this.c1.getLivraison());
    this.c1.getDomicile().equals(d);
    this.c1.getLivraison(0).equals(l);
  }

  @Test
  public void verifMail(){
    this.c2.getDomicile().getEmail().equals("edsger@dijstra.org");
  }

  @Test
  public void verifUrl(){
    this.c2.getDomicile().getUrl().equals("https://fr.wikipedia.org/wiki/Edsger_Dijkstra");
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClientTest that = (ClientTest) o;
    return c.equals(that.c) &&
            c1.equals(that.c1) &&
            d.equals(that.d) &&
            l.equals(that.l);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c, c1, d, l);
  }


}