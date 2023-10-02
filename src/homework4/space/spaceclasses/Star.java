package homework4.space.spaceclasses;

import java.util.ArrayList;
import java.util.List;

public class Star extends SpaceObject{

	private final List<Planet> planets = new ArrayList<>();

	public Star(String name, int mass, int radius, boolean isStar) {
		super(name, mass, radius, isStar);
	}

	public void addPlanet(Planet planet){
		planets.add(planet);
	}

	public List<Planet> getPlanets() {
		return planets;
	}
}
