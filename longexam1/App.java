import Locations.*;
import Peeps.*;
public class App {
    public static void main(String[] args) throws Exception {

        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod
        Locations baguio = new Baguio();
        Locations boracay = new Boracay();
        Locations cebu = new Cebu();
        Locations davao = new Davao();
        Locations palawan = new Palawan();
        Locations siargao = new Siargao();

        Tourist karl = new Me();

        baguio.accept(karl);
        boracay.accept(karl);
        cebu.accept(karl);
        davao.accept(karl);
        palawan.accept(karl);
        siargao.accept(karl);

    }
}
