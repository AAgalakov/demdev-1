package homework4.space.spaceclasses;

public class Comets extends SpaceObject{

	private final String color;

	public Comets(String name, int mass, int radius, boolean isStar, String color) {
		super(name, mass, radius, isStar);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Comets{" + "color='" + color + '\'' + ", name='" + name + '\'' + '}';
	}
}
