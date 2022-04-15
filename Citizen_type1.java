package taxApplication;
import test.LandOwner;
import java.lang.Math;
public class Citizen_type1 implements TaxCalculator {

	public LandOwner landowner;
	public Citizen_type1(LandOwner landowner)
	{
	  this.landowner=landowner;
	}
	public double computeTax(double constanta)
	{
		
		double tax=Math.ceil(this.landowner.ComputetotalArea())*constanta;
		return tax;
	}
	
}
