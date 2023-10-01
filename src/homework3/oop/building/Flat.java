package homework3.oop.building;

public class Flat {

	private final int number;
	private final Room[] rooms;

	public Flat(int number, Room[] rooms) {
		this.number = number;
		this.rooms = rooms;
	}

	public void print() {
		System.out.println("Номер квартиры " + number + ", количество комнат " + rooms.length);
	}

	public int getNumber() {
		return number;
	}

	public Room[] getRooms() {
		return rooms;
	}
}
