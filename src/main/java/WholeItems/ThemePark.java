package WholeItems;

import Attractions.Attraction;
import Attractions.RollerCoaster;
import People.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Visitor> visitors;

    public ThemePark(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
        this.visitors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public int attractionCount() {
        return attractions.size();
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }
}
