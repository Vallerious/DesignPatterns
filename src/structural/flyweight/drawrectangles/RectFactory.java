package structural.flyweight.drawrectangles;

import java.awt.Color;
import java.util.HashMap;

import com.sun.glass.ui.TouchInputSupport;

/**
 * Flyweight Factory
 * 
 * @author valerivaleriev
 *
 */
public class RectFactory {
  private static final HashMap<Color, MyRect> rectsByColor = new HashMap<>();
  
  public static MyRect getRect(Color color) {
    MyRect rect = RectFactory.rectsByColor.get(color);
    
    if (rect == null) {
      rect = new MyRect(color);
      
      rectsByColor.put(color, rect);
    }
    
    return rect;
  }
}
