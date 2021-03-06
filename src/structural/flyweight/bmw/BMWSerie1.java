package structural.flyweight.bmw;

/**
 * Flyweight
 * 
 * The object holds data only for the specific characteristics of the car.
 * All variant things that the customer might want to have are handled by passing a Customization object.
 * 
 * 
 * @author valerivaleriev
 *
 */
class BMWSerie1 implements BMWCar {
  private final static double BASE_PRICE = 25000;

  @Override
  public double calculatePrice(BMWCarCustomisation custom) {
      return BASE_PRICE + getSpecificSerie1PriceBasedOnCustom(custom) + getExportationTaxe(custom);
  }

  @Override
  public void printFullCharacteristics(BMWCarCustomisation custom) {
      // print all BMW 1 Series specific characteristics
      // (codes in there)
      custom.printCustomisations(); // print details based on these customizations
  }

  private double getSpecificSerie1PriceBasedOnCustom(BMWCarCustomisation custom) {
      // (e.g., calculation based on custom specific to Series 1)
      double sum = 0;
      if (custom.getTireSize() == 19) {
          sum += 1200;
      } else {
          sum += 2100;
      }
      return sum;
  }

  private double getExportationTaxe(BMWCarCustomisation custom) {
      // (calculation based on custom exportation taxes only for this model)
      double sum = 0;
      if (!custom.getLaserSignature().isEmpty()) {
          sum += 987;
      }
      return sum;
  }
}
