package homework4.space.spaceclasses;

public class Sputnik extends SpaceObject{

	private final Planet nameOfPlane;

	private final int distanceToPlanet;

	public Sputnik(String name, int mass, int radius, boolean isStar, Planet nameOfPlane, int distanceToPlanet) {
		super(name, mass, radius, isStar);
		this.nameOfPlane = nameOfPlane;
		this.distanceToPlanet = distanceToPlanet;
	}

	public Planet getNameOfPlane() {
		return nameOfPlane;
	}
}
