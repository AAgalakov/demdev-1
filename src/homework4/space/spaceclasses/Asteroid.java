package homework4.space.spaceclasses;

public class Asteroid extends SpaceObject{

	private int speed;

	public Asteroid(String name, int mass, int radius, boolean isStar, int speed) {
		super(name, mass, radius, isStar);
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Asteroid{" + "speed=" + speed + ", name='" + name + '\'' + '}';
	}
}
