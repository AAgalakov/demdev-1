package homework4.space.spaceclasses;

public final class SpaceUtils {

	private SpaceUtils() {
	}

	public static int calculateGravityPower (SpaceObject object1, SpaceObject object2){

		return (object1.getMass() * object2.getMass());
	}

	public static boolean isStar(SpaceObject object){
		return object.isStar();
	}
}
