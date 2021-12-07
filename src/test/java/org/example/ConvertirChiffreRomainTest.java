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
    @Test
    public void testConversionChiffreArabeEnChiffreRomain_doitRetournerMCMXLIV() {
        int number = 1944;
        ConvertirChiffreRomain chiffreRomain = new ConvertirChiffreRomain();
        String conversionChiffres = chiffreRomain.conversionChiffreArabeEnChiffreRomain(number);
        Assert.assertEquals("MCMXLIV", conversionChiffres);
    }
    @Test
    public void testConversionChiffreArabeEnChiffreRomain_doitRetournerMMVI() {
        int number = 2006;
        ConvertirChiffreRomain chiffreRomain = new ConvertirChiffreRomain();
        String conversionChiffres = chiffreRomain.conversionChiffreArabeEnChiffreRomain(number);
        Assert.assertEquals("MMVI", conversionChiffres);
    }
}
