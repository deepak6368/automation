package WatchOut;

public class Room1 {
	public static double calculateVolume(double length, double width, double height) {
		double volume = length * width * height;
		return volume;
	}

	public static void main(String[] args) {
		Room1 obj = new Room1();

		double volume = Room1.calculateVolume(18, 20, 25);

		System.out.println("Volume of the rectangular cuboid: " + volume);
	}

}
