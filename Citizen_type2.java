package taxApplication;

import test.LandOwner;
import java.lang.Math;
public class Citizen_type2 implements TaxCalculator {
	
	public LandOwner landowner;
	private double area;
	public Citizen_type2(LandOwner landowner)
	{
	  this.landowner=landowner;
	  this.area=landowner.ComputetotalArea();
	 
	}
	public double computeTax(double constanta)
	{
		area=Math.ceil(area);
		double tax;
		double parameter;
		if(area<1000)
			{tax=area*constanta;
			 return tax;
			}
		else
			tax=1000*constanta;
        if(area>1000)
        {
            parameter=3;
        	tax+=(area-1000)*parameter;
        }
        if(area>2000)
        {
           parameter=5;
           tax+=(area-2000)*parameter;
        }
        if(area>3000)
        {
        	parameter=7;
        	tax+=(area-3000)*parameter;
        }
        if(area>4000)
        {
        	parameter=10;
        	tax+=(area-4000)*parameter;
        }
        
        return tax;
	}     

	}
