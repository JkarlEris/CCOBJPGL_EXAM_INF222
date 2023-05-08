package Locations;
import Peeps.Tourist;

public class Davao implements Locations {

    public int airFare = 50;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}