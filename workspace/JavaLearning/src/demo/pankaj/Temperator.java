package demo.pankaj;

public class Temperator {


public double tempcalculator(double f){
	 double cel;
    return cel = (f-32) / 1.8;
	
}

    public static void main(String args[])
    {
        
		Temperator t=new Temperator();
        System.out.print("Equivalent Temperature in Celsius = " + t.tempcalculator(90));
    }
}