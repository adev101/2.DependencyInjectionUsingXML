package demoMovie;

public class TopGunRating implements MovieRating {

	public static String movieName;
	
	public void TopGunRating(String name){
		movieName = name;
	}
	
	@Override
	public int getMovieRating() {
		// mimic API response
		return APICall(movieName);
	}
	
	
	
	private int APICall(String movieName) {
		return 9;
	}

}
