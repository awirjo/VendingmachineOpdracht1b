package sr.unasat.vendingmachine.entities;

public class Beverage {

    private String name;
    private Double price;

    public Beverage (String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }
}
