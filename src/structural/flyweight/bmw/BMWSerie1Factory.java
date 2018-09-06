package structural.flyweight.bmw;

class BMWSerie1Factory implements BMWCarFactory {
  @Override
  public BMWCar createCar() {
      return new BMWSerie1();
  }
}
