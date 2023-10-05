package homework4.space.spaceobjects;

import homework4.space.other.Coordinates;

public class Sputnik extends SpaceObject {

	private final Planet nameOfPlane;

	private final int distanceToPlanet;

	public Sputnik(String name, int mass, int radius, boolean isStar, Coordinates coordinates, Planet nameOfPlane,
				   int distanceToPlanet) {
		super(name, mass, radius, isStar, coordinates);
		this.nameOfPlane = nameOfPlane;
		this.distanceToPlanet = distanceToPlanet;
	}

	public Planet getNameOfPlane() {
		return nameOfPlane;
	}

	@Override
	public String toString() {
		return "Sputnik{" + "nameOfPlane=" + nameOfPlane + ", distanceToPlanet=" + distanceToPlanet + ", name='" + name
			+ '\'' + '}';
	}
}
