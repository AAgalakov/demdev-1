package homework4.space.spaceobjects;

import homework4.space.other.Coordinates;

import java.util.ArrayList;
import java.util.List;

public class Star extends SpaceObject {

	private final List<Planet> planets = new ArrayList<>();

	public Star(String name, int mass, int radius, boolean isStar, Coordinates coordinates) {
		super(name, mass, radius, isStar, coordinates);
	}

	public void addPlanet(Planet planet) {
		planets.add(planet);
	}

	public List<Planet> getPlanets() {
		return planets;
	}

	@Override
	public String toString() {
		return "Star{" + "planets=" + planets + ", name='" + name + '\'' + '}';
	}
}
