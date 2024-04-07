/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vegadevh.elonstoycar;

/**
 *
 * @author vegad
 */
public class ElonsToyCar {
    
    private int drivenDistance;
    private int batteryPercentage;

    public ElonsToyCar() {
        this.drivenDistance = 0;
        this.batteryPercentage = 100;
    }

    public int getDrivenDistance() {
        return drivenDistance;
    }

    public void setDrivenDistance(int drivenDistance) {
        this.drivenDistance = drivenDistance;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
    
    /**
     * In this exercise you'll be playing around with a remote controlled car, 
     * which you've finally saved enough money for to buy.
     * 
     *Cars start with full (100%) batteries. 
     *Each time you drive the car using the remote control, it covers 20 meters and drains one percent of the battery.
     * 
     * The remote controlled car has a fancy LED display that shows two bits of information:
     * 
     *      The total distance it has driven, displayed as: "Driven <METERS> meters".
     *      The remaining battery charge, displayed as: "Battery at <PERCENTAGE>%".
     * 
     * If the battery is at 0%, you can't drive the car anymore and the battery display will show "Battery empty".
     * 
     * You have six tasks, each of which will work with remote controlled car instances.
     */
    
    
    /**
     * Implement the (static) ElonsToyCar.buy() method to return a brand-new remote controlled car instance 
     */
    
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }
    
    /**
     * Implement the ElonsToyCar.distanceDisplay()
     * method to return the distance as displayed on the LED display:
     */

    public String distanceDisplay() {
        return "Driven " + this.drivenDistance + " meters";
    }
    
    /**
     * Implement the ElonsToyCar.batteryDisplay()
     * method to return the battery percentage as displayed on the LED display
     */

    public String batteryDisplay() {
        if(this.batteryPercentage != 0){
            return "Battery at " + this.batteryPercentage+"%";
        }else{
            return "Battery empty";            
        }
    }
    
    /**
     * Implement the ElonsToyCar.drive() method that updates the number of meters driven
     */

    public void drive() {
        if(this.batteryPercentage > 0){
            this.drivenDistance = this.drivenDistance + 20;
            this.batteryPercentage = --this.batteryPercentage;
        }
    }

    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
        car.drive();
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
    }
}
