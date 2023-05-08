package Peeps;
import Locations.*;

public class Me implements Tourist {

    static int budget = 1000;
    int af;

    public void visit() {
        if (budget >= af){
            budget -= af;
            System.out.println("Enjoying my stay ♡♡♡");
            checkBudget();
            System.out.println("Thank you Next!");
            
            System.out.println("~~~ ~~~");
            System.out.println(" ");
        
        
        } else if(budget < af || budget <= 0){
            budget -= af;
            checkBudget();
            System.out.println("Insufficient amount of Money, Save up kid"); 
        }
            
        
    }

    public void visit(Boracay boracay) {
        af = boracay.airFare;
        System.out.println("OTW TO BORACAY");
        visit();
    }

    public void visit(Baguio baguio) {
        af = baguio.airFare;
        System.out.println("OTW TO BAGUIO");
        visit();
    }

    public void visit(Cebu cebu) {
        af = cebu.airFare;
        System.out.println("OTW TO CEBU");
        visit();
    }

    public void visit(Davao davao) {
        af = davao.airFare;
        System.out.println("OTW TO DAVAO");
        visit();
    }

    public void visit(Palawan palawan) {
        af = palawan.airFare;
        System.out.println("OTW TO PALAWAN");
        visit();
    }

    public void visit(Siargao siargao) {
        af = siargao.airFare;
        System.out.println("OTW TO SIARGAO");
        visit();
    }

    public void checkBudget() {
        if (budget > 0){
            System.out.println("my budget is " + budget);
    }
        else{
            System.out.println("You have 0 money I'm so sorry");
        }
}

}
