package test;
import java.lang.Math;
public class Triangle implements Shape {

	private double l1,l2,l3;
	public Triangle(double l1,double l2,double l3)
	{
	   this.l1=l1;
	   this.l2=l2;
	   this.l3=l3;
	}
	public double computeArea()
	{
		double s=(l1+l2+l3)/3;
		return Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
	}
}
