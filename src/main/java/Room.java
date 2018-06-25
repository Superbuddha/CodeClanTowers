import java.util.ArrayList;

public abstract class Room {

    public String name;
    public int capacity;
    private ArrayList<Guest>guests;

    public Room(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity(){
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }
//somehow the methods do not pass to the subs
    public void addGuest(Guest guest){
        Guest.add(guest);
    }

    public void removeGuest(Guest guest) {
        Guest.remove(guest);
    }
    public void countGuest(){
        return guests.size;
    }
}
