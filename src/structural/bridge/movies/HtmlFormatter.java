package structural.bridge.movies;

import java.util.List;

/**
 * Implementor 2
 * 
 * @author valerivaleriev
 *
 */
public class HtmlFormatter implements Formatter {

	@Override
	public String format(String header, List<Detail> details) {
		return "<html>some header some details</html>";
	}

}
