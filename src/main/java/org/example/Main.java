package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        Car holden2 = new Holden(6, "Holden Commodore");
        System.out.println(holden.equals(holden2));*/

        GasPoweredCar gpc = new GasPoweredCar("ads","ads",2,2);
        gpc.startEngine();
        gpc.drive();

        HybridCar hc = new HybridCar("aa","aa",2,3,4);
        hc.startEngine();
        hc.drive();

        CarSkeleton a = new CarSkeleton();
        a.startEngine();

    }
}