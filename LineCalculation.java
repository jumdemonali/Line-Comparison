package com.bl.pract;

public class LineCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = 4 , y1 = 5 , x2 = 5 , y2 = 1 , x3 = 5 , y3 = 8 , x4 = 8 , y4 = 1 ;
		double dist = Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2- y1 , 2));
	    double dist1 = Math.sqrt(Math.pow(x4 - x3 , 2) + Math.pow(y4- y3 , 2));
	    String line1 = Double.toString(dist);
	    String line2 = Double.toString(dist1);
	    Boolean equal = line1.equals(line2);
	    int compare = line1.compareTo(line2);
	    if ( compare == 0 ) {
	    	System.out.println("Both Lines are equal");
	    }
	    else if ( compare >= 1)
		{
			System.out.println("Line1 greater then other line ");
		}
		else {
			System.out.println("Line1 smaller then other line ");
		}
	}

}
