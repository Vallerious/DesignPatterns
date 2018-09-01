package structural.bridge.colorshapeexample;

public class ColorShapeDemo {

	public static void main(String[] args) {
	    /*
	     * Ummmmmm I'm not sure how this is a good example..it's just composition...
	     */
		Color red = new Red();
		Shape sq = new Square(red);
		
		sq.applyColor();
	}

}
