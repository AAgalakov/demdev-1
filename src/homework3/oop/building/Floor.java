package homework3.oop.building;

public class Floor {

	private final int number;
	private final Flat[] flats;

	public Floor(int number, Flat[] flats) {
		this.number = number;
		this.flats = flats;
	}

	public void print() {
		System.out.println("Этаж " + number + ", количество квартир " + flats.length);
	}

	public int getNumber() {
		return number;
	}

	public Flat[] getFlats() {
		return flats;
	}
}
