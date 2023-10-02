package homework4.space.spaceobjects;

import homework4.space.other.Coordinates;

public class Meteorite extends SpaceObject {

	public Meteorite(String name, int mass, int radius, boolean isStar, Coordinates coordinates) {
		super(name, mass, radius, isStar, coordinates);
	}

	@Override
	public String toString() {
		return "Meteorite{" + "name='" + name + '\'' + '}';
	}
}
