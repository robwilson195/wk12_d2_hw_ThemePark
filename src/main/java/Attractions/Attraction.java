package Attractions;

import Interfaces.IReviewed;

public abstract class Attraction implements IReviewed {


    private final String name;
    private final int minAge;
    private final int minHeight;
    private double defaultPrice;
    private int rating;

    public Attraction(String name, int minAge, int minHeight, double defPrice, int rating) {
        this.name = name;
        this.minAge = minAge;
        this.minHeight = minHeight;
        this.defaultPrice = defPrice;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public double getDefaultPrice() {
        return defaultPrice;
    }

    public int getRating() {
        return rating;
    }
}
