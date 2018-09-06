package structural.flyweight.bmw;

class BMWSerie2Factory implements BMWCarFactory {
  @Override
  public BMWCar createCar() {
      return new BMWSerie2();
  }
}
