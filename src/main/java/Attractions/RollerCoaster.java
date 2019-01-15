package Attractions;

import Interfaces.ISecurity;
import Interfaces.ITicketed;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int minAge, int minHeight, double defPrice, int rating){
        super(name, minAge, minHeight, defPrice, rating);
    }
}
