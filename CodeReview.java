package code_Review;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CodeReview {

	public static void main(String[] args) throws IOException {
		Circle c1 = new Circle("Circle", "Red", 293 );
		Square s1 = new Square("Square", "Blue", 19);

		File file = new File("Shapes.txt");
		
		file.createNewFile();
		
		FileWriter writer = new FileWriter(file);
		
		writer.write(c1.toString());
		writer.write(s1.toString());
		writer.flush();
		writer.close();
	}

}
