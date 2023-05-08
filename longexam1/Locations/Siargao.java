package Locations;
import Peeps.Tourist;

public class Siargao implements Locations {

    public int airFare = 300;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
