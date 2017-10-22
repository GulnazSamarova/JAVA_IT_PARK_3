package com.company;

import java.util.HashMap;

public class Car {
    private int weight;
    private String color;
    private int maxSpeed;
    private int fuelConsumpton;
    private int tankVolume;



    private Car (Builder builder){
        this.weight = builder.weight;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
        this.fuelConsumpton = builder.fuelConsumpton;
        this.tankVolume = builder.tankVolume;
    }

    public static class Builder {
        private int weight;
        private String color;
        private int maxSpeed;
        private int fuelConsumpton;
        private int tankVolume;

        public Builder weight (int weight){
            this.weight = weight;
            return this;
        }

        public Builder color (String color){
            this.color = color;
            return this;
        }

        public Builder maxSpeed (int maxSpeed){
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder fuelConsumption (int fuelConsumption) {
            this.fuelConsumpton = fuelConsumption;
            return this;
        }

        public Builder tankVolume (int tankVolume){
            this.tankVolume = tankVolume;
            return this;

        }

        public Car build(){
            return new Car(this);
        }

    }

    public static Builder builder(){
        return new Builder();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuelConsumpton() {
        return fuelConsumpton;
    }

    public void setFuelConsumpton(int fuelConsumpton) {
        this.fuelConsumpton = fuelConsumpton;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
