package homework3.oop.building;

public class House {

	private final int number;
	private final Floor[] floors;

	public House(int number, Floor[] floors) {
		this.number = number;
		this.floors = floors;
	}

	public void print() {
		System.out.println("Номер дома " + number + ", количество этажей " + floors.length);
	}

	public int getNumber() {
		return number;
	}

	public Floor[] getFloors() {
		return floors;
	}
}
