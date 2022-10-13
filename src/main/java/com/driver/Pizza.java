package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheezPrice;
    private boolean addCheez;
    private int extraToppingPrice;
    private boolean addToppings;
    private boolean takeAway;
    private int takeAwayCost;
    private  boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.extraCheezPrice = 80;
        this.addCheez = false;
        this.isBillGenerated = false;

        this.extraToppingPrice = 70;
        this.addToppings = false;

        this.takeAway = false;
        takeAwayCost = 20;

        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.extraToppingPrice = 70;
        }
        else{
            this.price = 400;
            this.extraToppingPrice = 120;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(addCheez == false){
            this.price = this.price + this.extraCheezPrice;
            this.addCheez = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(addToppings == false){
            this.price = this.price + this.extraToppingPrice;
            this.addToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeAway == false){
            this.price = this.price + takeAwayCost;
            this.takeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false){
            isBillGenerated = true;

            if(addCheez == true){
                this.bill = this.bill + "Extra Cheese Added:" + this.extraCheezPrice + "\n";
            }
            if(addToppings == true){
                this.bill = this.bill + "Extra Toppings Added:" + this.extraToppingPrice + "\n";
            }
            if(takeAway == true){
                this.bill = this.bill + "Paperbag Added:" + this.takeAwayCost+ "\n";
            }
            this.bill = this.bill + "Total Price: " + this.price;
        }

        return this.bill;
    }
}
