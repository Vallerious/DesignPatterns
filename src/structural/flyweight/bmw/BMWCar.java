package structural.flyweight.bmw;

interface BMWCar {
  double calculatePrice(BMWCarCustomisation custom);

  void printFullCharacteristics(BMWCarCustomisation custom);
}
