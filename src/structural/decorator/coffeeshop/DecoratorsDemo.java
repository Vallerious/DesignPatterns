package structural.decorator.coffeeshop;
/**
 * Example of decorator pattern
 * 
 * @author valerivaleriev
 *
 */
public class DecoratorsDemo {
  public static void main(String[] args) {
    Bevarage espresso = new Espresso();
    
    System.out.println("Cost of plain espresso is: " + espresso.getCost());
    
    Bevarage espressoWithCaramel = new Caramel(espresso);
    
    System.out.println("Cost of espresso with caramel is: " + espressoWithCaramel.getCost());
    
    Bevarage espressoWithCaramelAndCinamon = new Caramel(new Cinamon(espresso));
    
    System.out.println("Cost of espresso with caramel and cinamon is: " + espressoWithCaramelAndCinamon.getCost());
    
    /*
     * Output:
     * Cost of plain espresso is: 1.5
     * Cost of espresso with caramel is: 2.5
     * Cost of espresso with caramel and cinamon is: 3.0
     */
  }
}
