package com.company;

public class HeightHumanComparator implements HumanComparator {
    private Human a;
    private Human b;

    public HeightHumanComparator(Human a, Human b) {
        this.a = a;
        this.b = b;
    }

    public int compare(Human a, Human b) {
        int heightCompare;
        if (a.getHeight()< b.getHeight()){
            heightCompare = -1;}
        else if  (a.getHeight() > b.getHeight()){
            heightCompare = 1;}
        else {
            heightCompare = 0;}


        return heightCompare;
    }
}
