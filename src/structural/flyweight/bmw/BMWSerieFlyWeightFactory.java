package structural.flyweight.bmw;

import java.util.HashMap;
import java.util.Map;

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
