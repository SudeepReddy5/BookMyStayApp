abstract class Room {

    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sq ft");
        System.out.println("Price per night: ₹" + pricePerNight);
    }
}

class SingleRoom extends Room {

    int availability;

    public SingleRoom() {
        super(1, 250, 1500.0);
        availability = 5;
    }

    public void displayRoomDetails() {
        super.displayRoomDetails();
        System.out.println("Available Rooms: " + availability);
        System.out.println();
    }
}

class DoubleRoom extends Room {

    int availability;

    public DoubleRoom() {
        super(2, 400, 2500.0);
        availability = 3;
    }

    public void displayRoomDetails() {
        super.displayRoomDetails();
        System.out.println("Available Rooms: " + availability);
        System.out.println();
    }
}

class SuiteRoom extends Room {

    int availability;

    public SuiteRoom() {
        super(3, 750, 5000.0);
        availability = 2;
    }

    public void displayRoomDetails() {
        super.displayRoomDetails();
        System.out.println("Available Rooms: " + availability);
        System.out.println();
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        System.out.println("Single Room Details");
        single.displayRoomDetails();

        System.out.println("Double Room Details");
        doubleRoom.displayRoomDetails();

        System.out.println("Suite Room Details");
        suite.displayRoomDetails();
    }
}