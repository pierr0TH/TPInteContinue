package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class LeapYearsTest {
    @Test
    public void testIsLeapYears_YearDivisibleBy400_ShouldReturnTrue() {
        int year = 2000; //Arrange -> Année divisible par 400
        LeapYears leapYears = new LeapYears(); //Constructeur de la classe LeapYears
        //Nous avons besoin d'une instance de la classe LeapYears afin de pouvoir ap- peler la fonction isLeapYears
        boolean isLeapYears = leapYears.isLeapYears(year); //Act -> On regarde le ré- sultat avec l'année que nous avons renseignée durant l'étape Arrange.
        assertTrue(isLeapYears); //Assert -> Le test est bon si isLeapYears est vrai.
    }
    @Test
    public void testIsLeapYears_YearDivisibleBy100ButNotBy400_ShouldReturnFalse() {
        //Arrange
        int year = 1900;
        LeapYears leapYears = new LeapYears();
        //Act
        boolean isLeapYears = leapYears.isLeapYears(year);
        //Assert
        assertFalse(isLeapYears);
    }
    @Test
    public void testIsLeapYears_YearDivisibleBy4ButNotBy100_ShouldReturnTrue() { //Arrange
        int year = 1960;
        LeapYears leapYears = new LeapYears();
        //Act
        boolean isLeapYears = leapYears.isLeapYears(year);
        //Assert
        assertTrue(isLeapYears);
    }

    @Test
    public void testIsLeapYears_YearNotDivisibleBy4_ShouldReturnFalse(){
        //Arrange
        int year = 2019;
        LeapYears leapYears = new LeapYears();
        //Act
        boolean isLeapYears = leapYears.isLeapYears(year);
        //Assert
        assertFalse(isLeapYears);
    }
}
