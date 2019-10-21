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
        //TODO: Implement the Constructor
    }

    public void printCreatureStats(){
        //TODO: Implement this print method
    }

    public int getNumberOfEyes() {
        return this.numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public int getNumberOfArms() {
        //TODO: Implement this getter
    }

    public void setNumberOfArms(int numberOfArms) {
        //TODO: Implement this setter
    }

    public int getNumberOfLegs() {
        //TODO: Implement this getter
    }

    public void setNumberOfLegs(int numberOfLegs) {
        //TODO: Implement this setter
    }

}
