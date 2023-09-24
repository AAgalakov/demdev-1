package homework3.oop.building;

public class Room {

	private final boolean isEntrance;

	public Room(boolean isEntrance) {
		this.isEntrance = isEntrance;
	}

	public void print() {
		System.out.println("Комната " + (isEntrance ? "проходная" : "не проходная"));
	}

	public boolean isEntrance() {
		return isEntrance;
	}
}
