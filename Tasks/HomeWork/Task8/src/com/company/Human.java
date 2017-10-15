package com.company;

public class Human {
    private String name;
    private int age;
    private int weight;
    private int height;

   public Human (String name, int age, int weight, int height){
      this.name = name;
      if (age > 0) this.age = age;
      else this.age =0;
       if (weight > 0) this.weight = weight;
       else this.weight =1;
       if (height > 0) this.height = height;
       else this.height =1;

   }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

   public String getName() {
      return name;
 }

    public int getWeight() {
        return weight;
    }
}
