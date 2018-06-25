public class Bedroom extends Room {

    public String type;
    private int nightlyRate;

    public Bedroom(String name, int capacity, String type, int i) {
        super(name, capacity);
        this.type = type;
        this.nightlyRate = nightlyRate;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(int nightlyRate) {
        this.nightlyRate = nightlyRate;
    }
}