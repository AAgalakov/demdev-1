package homework3.oop;

import homework3.oop.building.Flat;
import homework3.oop.building.Floor;
import homework3.oop.building.House;
import homework3.oop.building.Room;

public class BuildingRunner {

	public static void main(String[] args) {
		Room room1 = new Room(true);
		Room room2 = new Room(false);
		Room[] rooms = {room1, room2};
		Flat flat1 = new Flat(1, rooms);
		Flat flat2 = new Flat(2, rooms);
		Flat flat3 = new Flat(3, rooms);
		Flat[] flats = {flat1, flat2, flat3};
		Floor floor1 = new Floor(1, flats);
		Floor floor2 = new Floor(2, flats);
		Floor[] floors = {floor1, floor2};
		House house = new House(1, floors);

		printAllInformation(house);
	}

	static void printAllInformation(House house) {
		house.print();
		Floor[] floors = house.getFloors();
		for (Floor floor : floors) {
			floor.print();
			Flat[] flats = floor.getFlats();
			for (Flat flat : flats) {
				flat.print();
				Room[] rooms = flat.getRooms();
				for (Room room : rooms) {
					room.print();
				}
			}
		}
	}
}
