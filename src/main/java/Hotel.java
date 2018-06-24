import java.util.ArrayList;

public class Hotel {

    public String name;
    private ArrayList<Room>rooms;

    public Hotel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
