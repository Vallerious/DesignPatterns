package structural.bridge.movies;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {
	private Movie movie;
	
	public MoviePrinter(Movie movie) {
		this.movie = movie;
	}

	@Override
	protected List<Detail> getDetails() {
		List<Detail> details = new ArrayList<>();
		
		details.add(new Detail("Title", this.movie.getTitle()));
		details.add(new Detail("Year", this.movie.getYear()));
		details.add(new Detail("Runtime", this.movie.getRuntime()));
		
		return details;
	}

	@Override
	protected String getHeader() {
		return this.movie.getClassification();
	}
	
}
