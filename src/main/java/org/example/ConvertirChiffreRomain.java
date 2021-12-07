package org.example;

public class ConvertirChiffreRomain {
    public static final int[] chiffresArabes = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    public static final String[] lettresRomaines = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    public String conversionChiffreArabeEnChiffreRomain (int nombre) {
        String chiffreRomain = "";
        if (nombre < 1 ) {
            System.out.println("Nombre invalide pour la conversion en chiffre romain");
        }
        while (nombre > 0) {
            if (nombre > 3000) {
                System.out.println("Nombre invalide pour la conversion en chiffre romain");
                break;
            }
            int num = 0;
            for (int i = 0; i < chiffresArabes.length; i++) {
                if (nombre >= chiffresArabes[i]) {
                    num = i;
                }
            }
            chiffreRomain += lettresRomaines[num];
            nombre -= chiffresArabes[num];
        }
        return chiffreRomain;
    }
}
