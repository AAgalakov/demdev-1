package homework4.space.spaceobjects;

import homework4.space.other.Coordinates;

public class Planet extends SpaceObject {

	private final Star star;
	private final int distanceToStar;
	private final int countOfPeople;

	public Planet(String name, int mass, int radius, boolean isStar, Coordinates coordinates, Star star,
				  int distanceToStar, int countOfPeople) {
		super(name, mass, radius, isStar, coordinates);
		this.star = star;
		this.distanceToStar = distanceToStar;
		this.countOfPeople = countOfPeople;
	}

	public int getCountOfPeople() {
		return countOfPeople;
	}

	@Override
	public String toString() {
		return "Planet{" + "star=" + star + ", distanceToStar=" + distanceToStar + ", countOfPeople=" + countOfPeople
			+ ", name='" + name + '\'' + '}';
	}
}
