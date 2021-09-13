package code_Review;

public class Square extends GenShape {
	private int perimeter;
	
	public Square (String shapeType, String color, int perimeter ) {
		super(shapeType, color);
		this.perimeter = perimeter;
	}
	
	public int getPerimeter() {
		return perimeter;
	}
	
	@Override
	public String toString() {
		return "\nThere is a " + getColor() + " " + getShape() + " with a perimeter of " + perimeter;
	}
}
