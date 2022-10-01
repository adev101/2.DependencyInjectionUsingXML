package demoMovie;

public class TopGun implements Movie {

	private MovieRating rating;
	
	public TopGun( MovieRating rat) {
		rating = rat;
	}
	
	
	@Override
	public String movieCount() {
		// TODO Auto-generated method stub
		return "TopGun has 2 movies in the series";
	}
	
	@Override
	public int getRating() {
		return rating.getMovieRating();
		
	}

}
