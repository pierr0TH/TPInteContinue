package org.example;

public class LeapYears {
        public boolean isLeapYears(int year) {
                if (year % 400 == 0) {
                        return true;
                }
                return false;
        }
}
