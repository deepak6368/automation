package WatchOut;

public class Room {
	 double calculateWallArea(double length, double breadth, double height) {
        double wallArea = 2 * (length + breadth) * height;
        return wallArea;
    }

    public static double calculateCeilingArea(double length, double breadth) {
        double ceilingArea = length * breadth;
        return ceilingArea;
    }

    public static void main(String[] args) {
    	Room TotalSum = new Room();
    	Double Total = TotalSum.calculateWallArea(12, 18, 56);
    	Room WallArea = new Room();
    	Double Wall = Room.calculateCeilingArea(12.5, 10);
//        double length = 10.5;
//        double breadth = 7.2;
//        double height = 3.0;
//
//        double wallArea = calculateWallArea(length, breadth, height);
//        double ceilingArea = calculateCeilingArea(length, breadth);

//        System.out.println("Area of the four walls: " + Total);
//        System.out.println("Area of the ceiling: " + Wall);
        System.out.println(Total+Wall);
        System.out.println("Total area is -" +" " +Total+Wall);
	}
}
