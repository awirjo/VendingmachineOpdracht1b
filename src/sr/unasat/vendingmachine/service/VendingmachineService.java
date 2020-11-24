package sr.unasat.vendingmachine.service;


import sr.unasat.vendingmachine.entities.Beverage;

public class VendingmachineService {

    private Beverage beverage1;
    private Beverage beverage2;

    public VendingmachineService (Beverage choice1, Beverage choice2){
        this.beverage1 = choice1;
        this.beverage2 = choice2;
    }

    public String chosenSoftdrink (String choice) {
        String message;
        switch (choice){
            case "one":
                message = "Take your" + " " +beverage1.getName().toUpperCase()+ " " + "from the bin. It cost " + beverage1.getPrice() + "SRD";
                break;
            case "two":
                message = "Take your" + " " +beverage2.getName().toUpperCase()+ " " + "from the bin. It cost" + beverage2.getPrice() + "SRD";
                break;
            default:
                message = " The chosen soft drink is not available ";

        }
        return message;
    }
}
