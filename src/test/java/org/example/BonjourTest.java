package org.example;
import org.junit.Assert;
import org.junit.Test;

public class BonjourTest {
    @Test
    public void testSaluer_doitRetournerBonjourAvecLeNom() {
        String name = "Jean";
        Bonjour bonjour  = new Bonjour();
        String saluer = bonjour.saluer(name);
        Assert.assertEquals("Bonjour, " + name, saluer);
    }
    @Test
    public void testSaluer_siParametreNullOuVide_doitRetournerBonjourLAmi() {
        String name = "";
        Bonjour bonjour = new Bonjour();
        String saluer = bonjour.saluer(name);
        Assert.assertEquals("Bonjour, l'ami", saluer);
    }
    @Test
    public void testSaluer_methodeDoitGererLesCris() {
        String name = "BARRET";
        Bonjour bonjour = new Bonjour();
        String saluer = bonjour.saluer(name);
        Assert.assertEquals("BONJOUR, " + name, saluer);
    }
}
