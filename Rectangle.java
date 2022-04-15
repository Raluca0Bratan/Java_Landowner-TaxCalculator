package test;

public class Rectangle implements Shape {
	
    private double length,width;
	
	public Rectangle (double length,double width)
	{
		this.length=length;
	    this.width=width;
	}
	public Rectangle ()
	{
		this.length=0;
		this.width=0;
	}
	public double computeArea()
	{
		return length*width;
	}

}
