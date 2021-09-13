package code_Review;

public class GenShape {
	private String shapeType;
	private String color;
	
	public GenShape (String shapeType, String color ) {
		super();
		this.shapeType = shapeType;
		this.color = color;
	}
	
	public String getShape() {
		return shapeType;
	}	

	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return "There is a " + color + " shape" + shapeType;
	}
}