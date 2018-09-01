package structural.bridge.movies;

import java.util.List;

/**
 * Implementor 1
 * 
 * @author valerivaleriev
 *
 */
public class PrintFormatter implements Formatter {

	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(header);
		sBuilder.append("\n");
		
		for (Detail detail : details) {
			sBuilder.append(detail.getLabel());
			sBuilder.append(":");
			sBuilder.append(detail.getValue());
			sBuilder.append("\n");
		}
		
		return sBuilder.toString();
	}

}
