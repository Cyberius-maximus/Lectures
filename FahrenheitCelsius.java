package Tutorial1;

import java.util.Scanner;
public class FahrenheitCelsius
{
	public static void main(String [] args)	
	{
	    double a;
        Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Enter  Fahrenheit temperature: ");
        a=sc.nextDouble(); 
	    System.out.println("Celsius temperature is = "+celsius(a));	
        sc.close();
    	  	  	     
	} 
	static double celsius(double f)
	{	
	return  (f-32)*5/9;
	}
}