package com.company;

public class AgeHumanComparator implements HumanComparator {
    private Human a;
    private Human b;

    public AgeHumanComparator(Human a, Human b) {
        this.a = a;
        this.b = b;
    }

    public int compare(Human a, Human b) {
        int ageCompare;
       if (a.getAge()< b.getAge()){
       ageCompare = -1;}
       else if  (a.getAge() > b.getAge()){
       ageCompare = 1;}
       else {
        ageCompare = 0;}


    return ageCompare;
    }


}
