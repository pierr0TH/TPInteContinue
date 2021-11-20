package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    public void isLeapYearsYearDivisibleBy400ShouldReturnTrue() {
        int year = 2000; //Arrange -> Année divisible par 400
        LeapYears leapYears = new LeapYears(); //Constructeur de la classe LeapYears
//Nous avons besoin d'une instance de la classe LeapYears afin de pouvoir ap- peler la fonction isLeapYears
        boolean isLeapYears = leapYears.isLeapYears(year); //Act -> On regarde le ré- sultat avec l'année que nous avons renseignée durant l'étape Arrange.
        assertTrue(isLeapYears); //Assert -> Le test est bon si isLeapYears est vrai.
    }
}
