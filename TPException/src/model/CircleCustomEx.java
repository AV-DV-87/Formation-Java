package model;

public class CircleCustomEx {
	
	private double radius;

	
	/**
	 * 
	 */
	public CircleCustomEx() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param radius
	 */
	public CircleCustomEx(double radius) throws InvalidRadiusException {
		super();
		//this.radius = radius;
		setRadius(radius);
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) throws InvalidRadiusException {
		this.radius = radius;
		if (radius<0)
			throw new InvalidRadiusException(radius, "la valeure d�finie pour le rayon "+radius+" est n�gative, impossible de cr�er le cercle.");
	}
	
	
}
