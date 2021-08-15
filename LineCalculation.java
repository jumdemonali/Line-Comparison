package com.bl.pract;

public class LineCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = 4 , y1 = 5 , x2 = 5 , y2 = 1 , x3 = 5 , y3 = 8 , x4 = 8 , y4 = 1 ;
		double distance = Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2- y1 , 2));
	    double distance1 = Math.sqrt(Math.pow(x4 - x3 , 2) + Math.pow(y4- y3 , 2));
	    String line1 = Double.toString(distance);
	    String line2 = Double.toString(distance1);
	    Boolean equal = line1.equals(line2);
	    int comp = line1.compareTo(line2);
	    if ( comp == 0 ) {
	    	System.out.println("Both Lines are equal");
	    }
	    else if ( comp >= 1)
		{
			System.out.println("Line1 greater then other line ");
		}
		else {
			System.out.println("Line1 smaller then other line ");
		}
	}

}
