package structural.bridge.movies;

/**
 * This class gives an example of the bridge pattern
 * 
 * We have different types of headers and different types of formatting of the rows.
 * If we decide to create class for each cartesian pair that would cost us a lot.
 * 
 * Instead, we create an abstraction that takes a movie and a formatter.
 * We can create different formatters that will create different representation of data.
 * We can create different printers that will extract and create headers in a varying ways. :)
 * 
 * @author valerivaleriev
 *
 */
public class MoviesDemo {

	public static void main(String[] args) {
		Movie movie = new Movie("Drama", "2:30", "Blue Velvet", "2018");
		
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
