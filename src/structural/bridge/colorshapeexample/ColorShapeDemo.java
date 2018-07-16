package structural.bridge.colorshapeexample;

public class ColorShapeDemo {

	public static void main(String[] args) {
		Color red = new Red();
		Shape sq = new Square(red);
		
		sq.applyColor();
	}

}
