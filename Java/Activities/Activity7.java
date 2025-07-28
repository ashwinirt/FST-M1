/*
 * 
In this activity we will be implementing Hybrid Inheritance (Multiple and Simple)

    Start by creating two interfaces - BicycleParts and BicycleOperations
    In BicycleParts:
        public int tyres: number of tyres on the bicycle
        public int maxSpeed: max speed of bicycle
    In BicycleOperations:
        public applyBrake(int decrement): how much to slow down the bicycle by.
        public speedUp(int increment): how much to speed up the bicycle by.


 */

package activities;

public class Activity7 {	
	
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }

}
