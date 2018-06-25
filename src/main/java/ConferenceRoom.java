public class ConferenceRoom extends Room {
    private int dailyRate;


    public ConferenceRoom(String name, int capacity, int dailyRate) {
        super(name, capacity);
        this.dailyRate = dailyRate;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }
}
