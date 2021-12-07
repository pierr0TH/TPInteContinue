package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        TataYoyo tataYoyo = new TataYoyo();
        for (int i = 1; i <= 50; i++) {
            tataYoyo.afficherTataYoyo(i);
            System.out.println("Nombre " + i);
        }
    }
}
