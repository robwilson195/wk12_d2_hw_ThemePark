package Attractions;

public class Playground extends Attraction{
    private int maxAge;

    public Playground(String name, int minAge, int minHeight, double defPrice, int rating, int maxAge) {
        super(name, minAge, minHeight, defPrice, rating);
        this.maxAge = maxAge;
    }

    public int getMaxAge() {
        return maxAge;
    }
}
