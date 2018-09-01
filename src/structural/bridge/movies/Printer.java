package structural.bridge.movies;

import java.util.List;

/**
 * Abstraction
 * 
 * @author valerivaleriev
 *
 */
public abstract class Printer {

	public String print(Formatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}
	
	abstract protected List<Detail> getDetails();
	
	abstract protected String getHeader();
}
