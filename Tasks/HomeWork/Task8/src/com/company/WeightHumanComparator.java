package com.company;

public class WeightHumanComparator implements HumanComparator {
    private Human a;
    private Human b;

    public WeightHumanComparator(Human a, Human b) {
        this.a = a;
        this.b = b;
    }

    public int compare(Human a, Human b) {
        int weightCompare;
        if (a.getWeight()< b.getWeight()){
           weightCompare = -1;}
        else if  (a.getWeight() > b.getWeight()){
            weightCompare = 1;}
        else {
            weightCompare = 0;}


        return weightCompare;
    }

}
