/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vegadevh.needforspeed;

/**
 *
 * @author vegad
 */
public class RaceTrack {
    
    private int distance;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    /*
    Allow creating a race track by defining a constructor for the RaceTrack class
    that takes the track's distance in meters as its sole parameter (which is of type int)
    
    **********
    int distance = 800;
    var raceTrack = new RaceTrack(distance);
    **********
    */
    
    RaceTrack(int distance) {
        this.setDistance(distance);
    }
    
    /*
    To finish a race, a car has to be able to drive the race's distance.
    This means not draining its battery before having crossed the finish line.
    Implement the RaceTrack.tryFinishTrack() method that takes a NeedForSpeed
    instance as its parameter and returns true if the car can finish the race;
    otherwise, return false
    
    ************
    int speed = 5;
    int batteryDrain = 2;
    var car = new NeedForSpeed(speed, batteryDrain);

    int distance = 100;
    var race = new RaceTrack(distance);

    car.distanceDriven()
    // => 0

    race.tryFinishTrack(car);
    // => true

    car.distanceDriven()
    // => 100
    ************
    */
    
    public boolean tryFinishTrack(NeedForSpeed car) {
        return car.getSpeed()*(car.getBattery()/car.getBatteryDrain()) >= this.getDistance() ? true:false;
    }
    
}
