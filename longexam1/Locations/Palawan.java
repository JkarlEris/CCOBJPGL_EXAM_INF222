package Locations;
import Peeps.Tourist;

public class Palawan implements Locations {

    public int airFare = 300;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}