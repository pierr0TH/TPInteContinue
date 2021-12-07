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
}
