package structural.flyweight.bmw;

interface BMWCarCustomisation {
  // customize Tire size
  int getTireSize();
  String getLaserSignature();
  // a lot of customization attributes can be in there for a BMW car
  void printCustomisations();
}
