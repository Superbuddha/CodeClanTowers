import java.util.ArrayList;

public abstract class Room {
    public String name;
    public int capacity;
    private ArrayList<Guest>guests;

    public Room(String name){
        this.name = name;
        this.guests = new ArrayList<Guest>();

    }

    public String getName() {
        return name;
    }
}
