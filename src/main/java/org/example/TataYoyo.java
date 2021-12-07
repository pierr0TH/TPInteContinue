package org.example;

public class TataYoyo {
    public String afficherTataYoyo(int number) {
        if (number % 3 == 0) {
            return "Tata";
        }
        return "Pas divisible par 3";
    }
}
