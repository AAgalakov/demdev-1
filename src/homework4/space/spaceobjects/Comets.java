package homework4.space.spaceobjects;

import homework4.space.other.Coordinates;

public class Comets extends SpaceObject {

	private final String color;

	public Comets(String name, int mass, int radius, boolean isStar, Coordinates coordinates, String color) {
		super(name, mass, radius, isStar, coordinates);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Comets{" + "color='" + color + '\'' + ", name='" + name + '\'' + '}';
	}
}
