package org.example;

public class TataYoyo {
    public String afficherTataYoyo(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Tata Yoyo");
            return "Tata Yoyo";

        } else if (number % 3 == 0) {
            System.out.println("Tata");
            return "Tata";
        } else if (number % 5 == 0) {
            System.out.println("Yoyo");
            return "Yoyo";
        }
        else {
            System.out.println("Nombre non divisible par 3 et par 5 : " + number);
            return "Nombre non divisible par 3 ni par 5";
        }

    }
}
