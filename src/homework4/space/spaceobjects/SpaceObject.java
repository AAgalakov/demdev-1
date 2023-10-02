package homework4.space.spaceobjects;

import homework4.space.other.Coordinates;

public abstract class SpaceObject {

	protected final String name;

	private final int mass;

	private final int radius;

	private final boolean isStar;

	private final Coordinates coordinates;

	public SpaceObject(String name, int mass, int radius, boolean isStar, Coordinates coordinates) {
		this.name = name;
		this.mass = mass;
		this.radius = radius;
		this.isStar = isStar;
		this.coordinates = coordinates;
	}

	public int calculateDiameter() {
		return radius * 2;
	}

	public int getMass() {
		return mass;
	}

	public SpaceObject isBiggerThen(SpaceObject spaceObject) {

		return this.mass > spaceObject.getMass() ? this : spaceObject;
	}

	public boolean isStar() {
		return isStar;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}
}
