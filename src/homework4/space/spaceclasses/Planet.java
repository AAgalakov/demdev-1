package homework4.space.spaceclasses;

public class Planet extends SpaceObject{

	private final Star star;
	private final int distanceToStar;
	private final int countOfPeople;

	public Planet(String name, int mass, int radius, boolean isStar, Star star, int distanceToStar, int countOfPeople) {
		super(name, mass, radius, isStar);
		this.star = star;
		this.distanceToStar = distanceToStar;
		this.countOfPeople = countOfPeople;
	}

	public int getCountOfPeople() {
		return countOfPeople;
	}

}
