package test;
import java.util.ArrayList;

public class LandOwner {

	private double totalArea;
	private ArrayList <Shape> shapes;
	public LandOwner(ArrayList <Shape> shapes)
	{
		this.shapes=shapes;
		totalArea=0;
	}
	public void AddShape(Shape shape)
	{
	   
	    this.shapes.add(shape);	
	   
	}
	public void DeletelastShape()
	{
		this.shapes.remove(this.shapes.size()-1);
		
	}
	public double ComputetotalArea()
	{
		totalArea=0;
		for(int i=0;i<shapes.size();i++)
			totalArea+=shapes.get(i).computeArea();
		return  totalArea;
	}
}
