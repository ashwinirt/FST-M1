/*
 * 
Given an age in seconds, calculate how old someone would be on:

    Earth: orbital period 365.25 Earth days, or 31557600 seconds
    Mercury: orbital period 0.2408467 Earth years
    Venus: orbital period 0.61519726 Earth years
    Mars: orbital period 1.8808158 Earth years
    Jupiter: orbital period 11.862615 Earth years
    Saturn: orbital period 29.447498 Earth years
    Uranus: orbital period 84.016846 Earth years
    Neptune: orbital period 164.79132 Earth years

So if you were told someone were 1,000,000,000 seconds old, you should be able to say that they're 31.69 Earth-years old.

 */

package activities;

public class Activity3 {

	 // Constant for the number of seconds in one Earth year
    private static final double EARTH_YEAR_IN_SECONDS = 31557600;

    // Planet orbital periods in Earth years
    private static final double MERCURY_YEAR = 0.2408467;
    private static final double VENUS_YEAR = 0.61519726;
    private static final double MARS_YEAR = 1.8808158;
    private static final double JUPITER_YEAR = 11.862615;
    private static final double SATURN_YEAR = 29.447498;
    private static final double URANUS_YEAR = 84.016846;
    private static final double NEPTUNE_YEAR = 164.79132;

    // Method to calculate age on different planets
    public static double calculateAgeOnEarth(long ageInSeconds) {
        return ageInSeconds / EARTH_YEAR_IN_SECONDS;
    }

    public static double calculateAgeOnPlanet(long ageInSeconds, double planetYear) {
        double ageInEarthYears = calculateAgeOnEarth(ageInSeconds);
        return ageInEarthYears / planetYear;
    }

    public static void main(String[] args) {
        long ageInSeconds = 1000000000; // Example age in seconds
        
        System.out.println("Age in seconds: " + ageInSeconds);
        
        // Calculate and print the age on each planet       
        System.out.println("Age on Mercury: " + calculateAgeOnPlanet(ageInSeconds, MERCURY_YEAR) + " years");
        System.out.println("Age on Venus: " + calculateAgeOnPlanet(ageInSeconds, VENUS_YEAR) + " years");
        System.out.println("Age on Earth: " + calculateAgeOnEarth(ageInSeconds) + " years");
        System.out.println("Age on Mars: " + calculateAgeOnPlanet(ageInSeconds, MARS_YEAR) + " years");
        System.out.println("Age on Jupiter: " + calculateAgeOnPlanet(ageInSeconds, JUPITER_YEAR) + " years");
        System.out.println("Age on Saturn: " + calculateAgeOnPlanet(ageInSeconds, SATURN_YEAR) + " years");
        System.out.println("Age on Uranus: " + calculateAgeOnPlanet(ageInSeconds, URANUS_YEAR) + " years");
        System.out.println("Age on Neptune: " + calculateAgeOnPlanet(ageInSeconds, NEPTUNE_YEAR) + " years");
    }

}
