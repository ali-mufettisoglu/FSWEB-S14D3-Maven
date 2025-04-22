package org.example.company;

import java.util.logging.Logger;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders,String name) {
        super(cylinders,name);
    }

    @Override
    public String startEngine() {
        return String.format("the %s's engine is starting",getName());
    }

    @Override
    public String accelerate() {
        return String.format("the %s's is accelerating",getName());
    }

    @Override
    public String brake() {
        return String.format("the %s's is braking",getName());
    }
}
