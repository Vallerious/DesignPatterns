package structural.bridge.movies;

public class MoviesDemo {

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("Drama");
		movie.setRuntime("2:30");
		movie.setTitle("Blue Velvet");
		movie.setYear("2018");
		
		
		/*
		 * It is kinda similar to the thing happening in the driver manager example....
		 * We give the movie printer a specific instance to work with, then we create a formatter
		 * and pass it to the moviePrinter.print - as long as the formatter is with the same interface
		 * it will work. That way we are bridging the formatting with the actual object.
		 */
		Printer moviePrinter = new MoviePrinter(movie);
		Formatter printFormatter = new PrintFormatter();

		String printedMaterial = moviePrinter.print(printFormatter);
		
		String htmlMaterial = moviePrinter.print(new HtmlFormatter());
		
		System.out.println(htmlMaterial);
	}

}
