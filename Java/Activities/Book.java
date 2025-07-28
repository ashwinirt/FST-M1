package activities;

public abstract class Book {
	protected String title;

	// Abstract method to set the title
	public abstract void setTitle(String s);

	// Concrete method to get the title
	public String getTitle() {
	   return title;
	}
}

//Class MyBook extends the abstract class Book
class MyBook extends Book {
	// Implementing the abstract setTitle method
	@Override
	public void setTitle(String s) {
	   title = s;  // Assign the argument value to the title field
	}
}

