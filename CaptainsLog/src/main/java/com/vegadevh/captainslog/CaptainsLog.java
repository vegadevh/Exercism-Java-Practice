/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vegadevh.captainslog;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author vegadevh
 */
public class CaptainsLog {
    
    private static char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
    
    private Random random;

    public CaptainsLog(Random random) {
        this.random = random;
    }
    
    /*
    The Starship Enterprise encounters many planets in its travels.
    Planets in the Star Trek universe are split into categories based on their properties.
    For example, Earth is a class M planet. All possible planetary classes are: D, H, J, K, L, M, N, R, T, and Y.

    Implement the randomPlanetClass() method. It should return one of the planetary classes at random.
    */
    
    char randomPlanetClass() {
        return PLANET_CLASSES[this.random.nextInt(PLANET_CLASSES.length)];
    }

    /*
    Enterprise (registry number NCC-1701) is not the only starship flying around!
    When it rendezvous with another starship, Mary needs to log the registry number of that starship.

    Registry numbers start with the prefix "NCC-" and then use a number from 1000 to 9999 (inclusive).

    Implement the randomShipRegistryNumber() method that returns a random starship registry number.
    */
    String randomShipRegistryNumber() {
        int min = 1000;
        int max = 9999;
        return "NCC-"+(this.random.nextInt(max-min+1)+min);
    }

    /*
    What's the use of a log if it doesn't include dates?

    A stardate is a floating point number.
    The adventures of the Starship Enterprise from the first season 
    of The Next Generation take place between the stardates 41000.0 and 42000.0.
    The "4" stands for the 24th century, the "1" for the first season.

    Implement the randomStardate() method
    that returns a floating point number between 41000.0 (inclusive) and 42000.0 (exclusive).
    */
    
    double randomStardate() {
        double min = 41000.0;
        double max = 42000.0;
        return min+(max-min)*this.random.nextDouble();
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        CaptainsLog captainsLog = new CaptainsLog(random);
        
        System.out.println("Planetary class: "+captainsLog.randomPlanetClass());
        System.out.println("Ship Registry Number: "+captainsLog.randomShipRegistryNumber());
        System.out.println("Stardate: "+captainsLog.randomStardate());
    }
}
