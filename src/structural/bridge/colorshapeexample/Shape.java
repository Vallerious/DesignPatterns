package structural.bridge.colorshapeexample;

public abstract class Shape {
	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	public void applyColor() {
		this.color.applyColor();
	}
}
