/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vegadevh.birdwatcher;

import java.util.Arrays;

/**
 *
 * @author vegadevh
 * 
 */
public class BirdWatcher {
    
    /**
     * You're an avid bird watcher that keeps track of how many birds have visited your garden in the last seven days.
     * You have six tasks, all dealing with the numbers of birds that visited your garden.
     */

    private static int[] birdsPerDay;
    
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    
    /**
     * For comparison purposes, you always keep a copy of last week's counts nearby,
     * which were: 0, 2, 5, 3, 7, 8 and 4.
     * Implement the BirdWatcher.getLastWeek() method that returns last week's counts:
     */
    
    public String getLastWeek() {
        return Arrays.toString(this.birdsPerDay);
    }
    
    /**
     * Implement the BirdWatcher.getToday() method to return how many birds visited your garden today.
     * The bird counts are ordered by day, with the first element being the count
     * of the oldest day, and the last element being today's count.
     */

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length-1];
    }

    /**
     * Implement the BirdWatcher.incrementTodaysCount() method to increment today's count:
     */
    
    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length-1] += 1;
    }

    /**
     * Implement the BirdWatcher.hasDayWithoutBirds() 
     * method that returns true if there was a day at which zero birds visited the garden;
     * otherwise, return false:
     */
    
    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).anyMatch(birds -> birds ==0);
    }

    /**
     * Implement the BirdWatcher.getCountForFirstDays() method
     * that returns the number of birds that have visited your garden
     * from the start of the week, but limit the count to the specified number of days from the start of the week.
     */
    
    public int getCountForFirstDays(int numberOfDays) {
        int birdsInXDays = 0;
        if(numberOfDays > this.birdsPerDay.length)
            numberOfDays = this.birdsPerDay.length;
        
        for (int i = 0; i < numberOfDays; i++) {
            birdsInXDays += this.birdsPerDay[i];
        }
        return birdsInXDays;
    }

    /**
     * Some days are busier that others.
     * A busy day is one where five or more birds have visited your garden.
     * Implement the BirdWatcher.getBusyDays() method to return the number of busy days:
     */
    
    public int getBusyDays() {
        int busyDays = 0;
        
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if(this.birdsPerDay[i] >= 5){
                busyDays += 1;
            }
        }
        return busyDays;
    }

    public static void main(String[] args) {
        int[] birdsJourney = {0, 2, 5, 3, 7, 8, 4};
        BirdWatcher birdsWatcher = new BirdWatcher(birdsJourney);
        
        System.out.println(birdsWatcher.getLastWeek());
        System.out.println(birdsWatcher.getToday());
        birdsWatcher.incrementTodaysCount();
        System.out.println(birdsWatcher.getToday());
        System.out.println(birdsWatcher.hasDayWithoutBirds());
        System.out.println(birdsWatcher.getCountForFirstDays(10));
        System.out.println(birdsWatcher.getBusyDays());
        
        
        
        
    }
}
