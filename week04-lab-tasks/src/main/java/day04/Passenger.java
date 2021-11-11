package day04;

public class Passenger {
    private String name;
    private String azon;
    private int luggageCount;

    public Passenger(String name, String azon, int luggageCount) {
        this.name = name;
        this.azon = azon;
        this.luggageCount = luggageCount;
    }

    public String getName() {
        return name;
    }

    public String getAzon() {
        return azon;
    }

    public int getLuggageCount() {
        return luggageCount;
    }
}
