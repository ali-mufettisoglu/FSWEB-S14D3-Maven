package org.example.company;

import java.util.logging.Logger;
import java.util.logging.Level;


public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders,String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders(){
        return cylinders;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name + " " + cylinders;
    }

    @Override
    public boolean equals(Object object){
        return ((Car)object).cylinders == cylinders && ((Car)object).name.equals(name);
    }

    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake(){
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }
}
