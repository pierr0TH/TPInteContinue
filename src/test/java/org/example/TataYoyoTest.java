package org.example;
import org.junit.Assert;
import org.junit.Test;

public class TataYoyoTest {
    @Test
    public void testAfficherTataYoyo_divisiblePar3_doitRetournerTata() {
        int number = 6;
        TataYoyo tataYoyo = new TataYoyo();
        String afficherTataYoyo = tataYoyo.afficherTataYoyo(number);
        Assert.assertEquals("Tata", afficherTataYoyo);
    }
    @Test
    public void testAfficherTataYoyo_divisiblePar5_doitRetournerYoyo() {
        int number = 35;
        TataYoyo tataYoyo = new TataYoyo();
        String afficherTataYoyo = tataYoyo.afficherTataYoyo(number);
        Assert.assertEquals("Yoyo", afficherTataYoyo);
    }
    @Test
    public void testAfficherTataYoyo_divisiblePar3EtPar5_doitRetournerTataYoyo() {
        int number = 45;
        TataYoyo tataYoyo = new TataYoyo();
        String afficherTataYoyo = tataYoyo.afficherTataYoyo(number);
        Assert.assertEquals("Tata Yoyo", afficherTataYoyo);
    }

}
