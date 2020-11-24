package sr.unasat.vendingmachine.app;

import sr.unasat.vendingmachine.entities.Beverage;
import sr.unasat.vendingmachine.service.VendingmachineService;

public class Application {
    public static void main(String[] args) {

        Beverage bv1 = new Beverage("Pepsi", 10.00);
        Beverage bv2 = new Beverage("7up", 10.00);
        VendingmachineService vs = new VendingmachineService(bv1,bv2);
        System.out.println(vs.chosenSoftdrink("one"));
    }
}