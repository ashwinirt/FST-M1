/*
 * In this activity we show implementation of Encapsulation.
    There is a plane that can on board passengers. Whenever plane takes off the date of taking off has to be updated. Same with landing.
    
    Start by creating a class called Plane.
    Add a constructor that initializes the values of maxPassengers and the array passengers to an empty array.
    Change the access modifier of the four variables to private.
    Add the following methods to the Plane class:
        on-board(): add passengers to the array using the add() method
        takeOff(): returns the current date and time
        land(): sets the value of lastTimeLanded to the current date and time. Also clear() the array.
        getLastTimeLanded(): returns the value of lastTimeLanded.
        getPassesngers(): returns the array of passengers.


 */
package activities;

public class Activity6 {
    
	public static void main(String[] args) throws InterruptedException {
        //There is a plane with max 10 passengers
        Plane plane = new Plane(10);
        //Add passengers on the list
        plane.onboard("John");
        plane.onboard("Steve");
        plane.onboard("Anna");
        //Plane takes off
        System.out.println("Plane took off at: " + plane.takeOff());
        //Print list of people on board
        System.out.println("People on the plane: " + plane.getPassengers());
        //Flying.....
        Thread.sleep(5000);
        //Plane has landed
        plane.land();
        //Plane lands
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
    }

}
