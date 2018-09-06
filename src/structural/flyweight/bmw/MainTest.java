package structural.flyweight.bmw;

/**
 * Example of the flyweight design pattern.
 * 
 * For this example of code the invariant part are the BMW Series 1 & 2 cars which are Flyweight objects;
 * the variant parts are passed through an operation.
 * For this example we doesn't need to create a car for each customer need and specification which can be troublesome
 * for all customization possibilities--the customization which is the variant part has an object that is only needed
 * for calculation and printing.
 * 
 * @author valerivaleriev
 *
 */
public class MainTest {

  public static void main(String[] args) {
    BMWCarFlyWeightFactory factory = new BMWSerieFlyWeightFactory();
    BMWCar serie1Car = factory.getBWMModel(Model.Serie1);
    BMWCar serie1Car2 = factory.getBWMModel(Model.Serie1);
    
    // Checks if the cache will return the same instance for a same serie car
    System.out.println("check for Object for Serie1:" + (serie1Car == serie1Car2));
    
    BMWCar serie2Car = factory.getBWMModel(Model.Serie2);
    BMWCar serie2Car2 = factory.getBWMModel(Model.Serie2);
    System.out.println("check for Object for Serie2:" + (serie2Car == serie2Car2));
    
    BMWCarCustomisation custom1 = new BMWSerieCarCustomisation(19, "Oh yeah");
    BMWCarCustomisation custom2 = new BMWSerieCarCustomisation(21, "For bob");
    BMWCarCustomisation custom3 = new BMWSerieCarCustomisation(26, "give it a ride !!");
    
    // BMW 1 Series
    System.out.println("BMW Serie1 + Custom1 Price:\nFull Price:" + serie1Car.calculatePrice(custom1));
    serie1Car.printFullCharacteristics(custom1);
    System.out.println("BMW Serie1 + Custom2 Price:\nFull Price:" + serie1Car.calculatePrice(custom2));
    serie1Car.printFullCharacteristics(custom2);
    System.out.println("BMW Serie1 + Custom3 Price:\nFull Price:" + serie1Car.calculatePrice(custom3));
    serie1Car.printFullCharacteristics(custom3);
  }

}
