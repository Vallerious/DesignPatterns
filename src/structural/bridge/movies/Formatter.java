package structural.bridge.movies;

import java.util.List;

/**
 * Implementor
 * 
 * @author valerivaleriev
 *
 */
public interface Formatter {
	String format(String header, List<Detail> details);
}
