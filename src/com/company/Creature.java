package com.company;

public class Creature {
    private int numberOfEyes;
    private int numberOfArms;
    private int numberOfLegs;
//    private numberOfTails;
//    private numberOfAntenna;

    //Default Creature Constructor
    public Creature(){
        this.numberOfEyes = 0;
        this.numberOfArms = 0;
        this.numberOfLegs = 0;
    }

    //Creature Constructor with parameters
    public Creature(int numOfEyes, int numOfArms, int numOfLegs){
        this.numberOfEyes = numOfEyes;
        this.numberOfArms = numOfArms;
        this.numberOfLegs = numOfLegs;
    }

    public void printCreatureStats(){
        System.out.println("Your creature has " + this.numberOfEyes + " eye(s), " + this.numberOfArms + " arm(s), and " + this.numberOfLegs + " leg(s).");

    }

    public int getNumberOfEyes() {
        return this.numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public int getNumberOfArms() {
        return this.numberOfArms;
    }

    public void setNumberOfArms(int numberOfArms) {
        this.numberOfArms = numberOfArms;
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

}
