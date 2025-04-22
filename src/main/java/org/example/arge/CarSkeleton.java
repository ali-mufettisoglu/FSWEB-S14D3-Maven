package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){

    }

    public CarSkeleton(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        System.out.println( "Car is starting");
    }
    public void drive() {
        runEngine();
        System.out.println( "Car is starting");
    }
    protected void runEngine() {
        if(this instanceof GasPoweredCar){
            System.out.println(((GasPoweredCar) this).getAverageKmPerLiter() + " km consumes avg per liter");
        } else if(this instanceof ElectricCar) {
            System.out.println(((ElectricCar) this).getAvgKmPerCharge() + " km consumes avg per charge");
        } else if(this instanceof HybridCar) {
            System.out.println(((HybridCar) this).getAvgKmPerLiter() + " km consumes avg per liter");
        }
    }

}
