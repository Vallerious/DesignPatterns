package structural.flyweight.bmw;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight Factory
 * 
 * Caches the objects so that we do not have to keep in memory instances with same data.
 * If, for example we have a factory for manifacturing cars we do not want to keep track of all the 
 * sales of cars
 * 
 * @author valerivaleriev
 *
 */
class BMWSerieFlyWeightFactory implements BMWCarFlyWeightFactory {
  private Map<Model, BMWCar> cache = new HashMap<>();

  public synchronized BMWCar getBWMModel(Model m) {
      if (!cache.containsKey(m)) {
          BMWCarFactory concreteFactory;
          switch (m) {
          case Serie2:
              concreteFactory = new BMWSerie2Factory();
              break;
          default:
              concreteFactory = new BMWSerie1Factory();
              break;
          }
          cache.put(m, concreteFactory.createCar());
      }
      return cache.get(m);
  }
}
