/*
 * 
In this activity we use the Abstract Class to show implementation of Abstraction.

For this activity:

    Create an abstract class Book that has:
        title of type String
        an abstract method setTitle() that takes one String argument.
        a concrete method getTitle() that returns the value of title.
    Create another class that extends the abstract class called MyBook.
    MyBook defines the setTitle() method to assign the value of title as the argument.


 */

package activities; 

public class Activity5 {

	public static void main(String[] args) {
	     // Create an object of MyBook
	     MyBook myBook = new MyBook();

	     // Set the title of the book
	     myBook.setTitle("Java Programming");

	     // Get and print the title of the book
	     System.out.println("The title of the book is: " + myBook.getTitle());
	 }

}
