package homework4.space.util;

import homework4.space.spaceobjects.SpaceObject;

public final class SpaceUtils {

	private SpaceUtils() {
	}

	public static double calculateGravityPower (SpaceObject object1, SpaceObject object2){

		return (object1.getMass() * object2.getMass() * getDistance(object1, object2)) / 2;
	}

	private static double getDistance(SpaceObject object1, SpaceObject object2) {
		return Math.sqrt(Math.pow(getCoordinatesDistanceX(object1, object2), 2) + Math.pow(getCoordinatesDistanceY(object1, object2), 2));
	}

	private static double getCoordinatesDistanceX(SpaceObject object1, SpaceObject object2){
		return Math.abs(object1.getCoordinates().getLineX() - object2.getCoordinates().getLineX());
	}


	private static double getCoordinatesDistanceY(SpaceObject object1, SpaceObject object2){
		return Math.abs(object1.getCoordinates().getLineY() - object2.getCoordinates().getLineY());
	}
	public static boolean isStar(SpaceObject object){
		return object.isStar();
	}
}
