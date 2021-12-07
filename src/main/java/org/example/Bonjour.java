package org.example;

public class Bonjour {
    public String saluer(String name) {
        return name == null || name.equals("") ? "Bonjour, l'ami" : "Bonjour, " + name;
    }
}
