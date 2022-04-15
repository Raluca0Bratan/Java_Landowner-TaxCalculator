package test;
import java.lang.Math;
public class Hexagon implements Shape {

	private double length;
	public Hexagon(double length)
	{
		this.length=length;
	}
	
	public double computeArea()
	{
		return (Math.sqrt(3)*3*length*length)/2;
	}
}
