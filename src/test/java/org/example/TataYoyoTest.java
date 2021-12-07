package org.example;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TataYoyoTest {
    @Test
    public void testAfficherTataYoyo_divisiblePar3_doitRetournerTata() {
        int number = 15;
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

}
