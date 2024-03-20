/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vegadevh.carsassemble;

/**
 *
 * @author vegadevh
 */
public class CarsAssemble {
    
    /**
    In this exercise you'll be writing code to analyze the production of an assembly line in a car factory.
    The assembly line's speed can range from 0 (off) to 10 (maximum).
    * 
    At its lowest speed (1), 221 cars are produced each hour.
    The production increases linearly with the speed.
    So with the speed set to 4, it should produce 4 * 221 = 884 cars per hour.
    However, higher speeds increase the likelihood that faulty cars are produced, which then have to be discarded.
    The following table shows how speed influences the success rate:

    - 1 to 4: 100% success rate.
    - 5 to 8: 90% success rate.
    - 9: 80% success rate.
    - 10: 77% success rate.
    */
    
    /**
    Implement the CarsAssemble.productionRatePerHour() method to calculate the assembly line's production rate per hour,
    taking into account its current assembly line's speed :
     * @param speed
     * @return 
    */
    
    static final int CARS_BUILD_PER_HOUR = 221;
    
    public static double productionRatePerHour(int speed) {
        double success;
        if(speed >0 && speed <= 4){
            success = 1;
            return speed * CARS_BUILD_PER_HOUR *success;
        }else if(speed > 4 && speed <=8){
            success = 0.9;
            return speed * CARS_BUILD_PER_HOUR * success;
        }else if(speed == 9){
            success = 0.8;
            return speed * CARS_BUILD_PER_HOUR * success;
        }else if(speed ==10){
            success = 0.77;
            return speed * CARS_BUILD_PER_HOUR * success;
        }else{
            System.out.println("That speed it's not aplicable for our systems.");
            return 0;
        }
    }

    /**
    Implement the CarsAssemble.workingItemsPerMinute() method to calculate how many working cars are produced per minute: 
    */
    public static int workingItemsPerMinute(int speed) {
        double items = productionRatePerHour(speed);
        return (int) (items/60);
    }
    
    public static void main(String[] args) {
        int speed = 9;
        
        System.out.println("Product Rate Per Hour with Speed level "+ speed +": "+ productionRatePerHour(speed));
        System.out.println("Working Items Per Minute with Speed level "+ speed +": "+ workingItemsPerMinute(speed));
        
    }
}
