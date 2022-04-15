package taxApplication;
import  java.util.ArrayList;
import  test.LandOwner;
import 	test.Hexagon;
import 	test.Rectangle;
import 	test.Triangle;
import 	test.Square;
import 	test.Shape;
class Main {

	public static void main(String[] args) {
		
		
		Rectangle rectangle = new Rectangle(40,20); 
	    Square square = new Square(25);
	    Triangle triangle= new Triangle(30,30,30);
	    Hexagon hexagon= new Hexagon(10);
	    ArrayList<Shape> shapes = new ArrayList <Shape>();
	    shapes.add(rectangle);
	    shapes.add(triangle);
	    shapes.add(square);
	    shapes.add(hexagon);
	    LandOwner landowner= new LandOwner(shapes);
	    LandOwner landowner2 =new LandOwner(shapes);
	    landowner2.DeletelastShape();
	    System.out.println("Total area is of citizen 1 : " + landowner.ComputetotalArea());
	    System.out.println("Total area is of citizen 2 : " + landowner2.ComputetotalArea());
		Citizen_type1 citizen1 = new Citizen_type1(landowner);
		System.out.println("The tax for the first citizen is :" + citizen1.computeTax(2)+ " bani ");
		Citizen_type2 citizen2 = new Citizen_type2(landowner2);
		System.out.println("The tax for the second citizen is :" + citizen2.computeTax(2)+ " bani ");
		
}
}
