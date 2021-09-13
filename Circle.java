package code_Review;

public class Circle extends GenShape {
	private int perimeter;
	
	public Circle (String shapeType, String color, int perimeter ) {
		super(shapeType, color);
		this.perimeter = perimeter;
	}
	
	public int getPerimeter() {
		return perimeter;
	}
	
	@Override
	public String toString() {
		return "There is a " + getColor() + " " + getShape() + " with a perimeter of " + perimeter;
	}
}
