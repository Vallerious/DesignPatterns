package structural.decorator.coffeeshop;

/**
 * Decorator 2
 * 
 * @author valerivaleriev
 *
 */
public class Caramel extends AddonDecorator {

  private Bevarage bevarage;
  
  public Caramel(Bevarage bevarage) {
    this.bevarage = bevarage;
  }
  
  @Override
  public double getCost() {
    return this.bevarage.getCost() + 1.0;
  }

}
