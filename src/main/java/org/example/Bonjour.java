package org.example;

import java.util.Objects;

public class Bonjour {
    private static boolean isStringUpperCase(String str){
        char[] charArray = str.toCharArray();
        for(int i=0; i < charArray.length; i++){
            if( !Character.isUpperCase( charArray[i] ))
                return false;
        }
        return true;
    }
    public String saluer(String name) {
        if (Objects.equals(name, "")) return "Bonjour, l'ami";
        if (isStringUpperCase(name)) return "BONJOUR, " + name;
        if (name.contains(",")) {
            name = name.replace(",", " et");
        }
        return "Bonjour, " + name;
    }
}
