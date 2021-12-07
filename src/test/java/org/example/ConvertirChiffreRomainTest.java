package org.example;
import org.junit.Assert;
import org.junit.Test;

public class ConvertirChiffreRomainTest {
    @Test
    public void testConversionChiffreArabeEnChiffreRomain() {
        int number = 5;
        ConvertirChiffreRomain chiffreRomain = new ConvertirChiffreRomain();
        String conversionChiffres = chiffreRomain.conversionChiffreArabeEnChiffreRomain(number);
        Assert.assertEquals("V", conversionChiffres);
    }
}
