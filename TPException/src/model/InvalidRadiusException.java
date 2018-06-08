package model;

public class InvalidRadiusException extends Exception {
	
	private double radius;
	
	
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}


	/**
	 * 
	 */
	public InvalidRadiusException(double radius,String message) {
		super();
		System.out.println(message);
		
	}
	
	
}
