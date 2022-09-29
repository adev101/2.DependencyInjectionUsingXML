package demoBook;

public class ComedyBook implements book {
	
	// define a private field for dependency (for dependency injection)
	private Thought objThought;
	
	
	//define a constructor for dependency injection
	public ComedyBook(Thought thought) {
		objThought = thought;
	}
	
	
	public String getBookName() {
		// TODO Auto-generated method stub
		return "Comedy Book returned";
	}

	@Override
	public String getThoughtOfTheDay() {
		// use thought class to get a thought
		return objThought.thoughtOfTheDay();
	}

}
