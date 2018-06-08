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
			throw new InvalidRadiusException(radius, "la valeure définie pour le rayon "+radius+" est négative, impossible de créer le cercle.");
	}
	
	
}
