package model;

public class Circle {
	
	private double radius;

	
	/**
	 * 
	 */
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		//this.radius = radius;
		setRadius(radius);
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
		if (radius<0)
			throw new IllegalArgumentException("Merci de saisir une valeure de rayon positive");
	}
	
	
}
