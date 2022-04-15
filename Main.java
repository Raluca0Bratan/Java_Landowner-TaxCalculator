package test;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
	Rectangle rectangle = new Rectangle(2,3.5); 
    Square square = new Square(2);
    Triangle triangle= new Triangle(2,3,4);
    Hexagon hexagon= new Hexagon(2);
    ArrayList<Shape> shapes = new ArrayList <Shape>();
    shapes.add(rectangle);
    shapes.add(triangle);
    shapes.add(square);
    shapes.add(hexagon);
    LandOwner landowner= new LandOwner(shapes);
    System.out.println(landowner.ComputetotalArea());
    landowner.DeletelastShape();
    System.out.println(landowner.ComputetotalArea());
	}

}
