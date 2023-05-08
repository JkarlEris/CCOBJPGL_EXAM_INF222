package Locations;
import Peeps.Tourist;

public class Baguio implements Locations {

    public int airFare = 200;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}