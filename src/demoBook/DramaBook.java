package demoBook;

public class DramaBook implements book {

	// define a private field for dependency (for dependency injection)
	private Thought objThought;
	
	
	//define a constructor for dependency injection
	public DramaBook(Thought thought) {
		objThought = thought;
	}
	
	
	@Override
	public String getBookName() {
		// TODO Auto-generated method stub
		return "returned a Drama book";
	}

	@Override
	public String getThoughtOfTheDay() {
		// TODO Auto-generated method stub
		return objThought.thoughtOfTheDay();
	}

}
