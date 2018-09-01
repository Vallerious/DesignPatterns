package structural.decorator.coffeeshop;

/**
 * Decorator 1
 * 
 * @author valerivaleriev
 *
 */
public class Cinamon extends AddonDecorator {

  private Bevarage bevarage;
  
  public Cinamon(Bevarage bevarage) {
    this.bevarage = bevarage;
  }

  @Override
  public double getCost() {
    return this.bevarage.getCost() + 0.50;
  }

}
