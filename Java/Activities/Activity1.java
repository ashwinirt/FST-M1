/*
In the class Activity1, create an Object of the Car class

Initialize the values of
    make to 2014
    color to "Black"
    transmission to "Manual"
Call the methods in the Car class to print the characteristics of the car, and what happens when you accelerate() and brake().
*/
package activities;
public class Activity1 {

	public static void main(String[] args) {
		
		Car honda = new Car("Black","Automatic",2020);
		
		//prints the details of the car
		honda.displayCharacteristics();
		
		//move the car
		honda.accelerate();
		
		//stop the car
		honda.brake();

	}

}
