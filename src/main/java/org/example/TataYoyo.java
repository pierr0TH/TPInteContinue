package org.example;

public class TataYoyo {
    public String afficherTataYoyo(int number) {
        if (number % 3 == 0) {
            System.out.println("Tata");
            return "Tata";
        } else if (number % 5 == 0) {
            System.out.println("Yoyo");
            return "Yoyo";
        }
        return "Pas divisible par 3 ni par 5";
    }
}
