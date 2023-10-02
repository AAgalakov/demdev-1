package homework4.space.spaceobjects;

import homework4.space.other.Coordinates;

public class Asteroid extends SpaceObject {

	private int speed;

	public Asteroid(String name, int mass, int radius, boolean isStar, Coordinates coordinates, int speed) {
		super(name, mass, radius, isStar, coordinates);
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	@Override
	public String toString() {
		return "Asteroid{" + "speed=" + speed + ", name='" + name + '\'' + '}';
	}
}
