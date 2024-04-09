/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vegadevh.remotecontrolcompetition;

/**
 *
 * @author vegadevh
 */
public class ExperimentalRemoteControlCar implements RemoteControlCar{
    
    private int speed;
    private int distance;

    public ExperimentalRemoteControlCar() {
        this.speed = 20;
        this.distance = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public void drive() {
        this.distance += this.speed;
    }

    @Override
    public int getDistanceTravelled() {
        return this.distance;
    }
    
}
