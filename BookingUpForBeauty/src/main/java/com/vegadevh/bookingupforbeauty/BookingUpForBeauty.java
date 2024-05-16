/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vegadevh.bookingupforbeauty;

import java.time.LocalDateTime;

/**
 *
 * @author vegadevh
 */
public class BookingUpForBeauty {
    
    /*
    Instructions
    In this exercise you'll be working on an appointment scheduler 
    for a beauty salon in New York that opened on September 15th in 2012.
    */

    public static void main(String[] args) {
        AppointmentScheduler scheduler = new AppointmentScheduler();
        
        System.out.println(scheduler.schedule("7/25/2019 13:45:00"));
        System.out.println("Has passed? "+scheduler.hasPassed(LocalDateTime.of(1999, 12, 31, 9, 0, 0)));
        System.out.println("Is Afternoon? "+scheduler.isAfternoonAppointment(LocalDateTime.of(2019, 03, 29, 15, 0, 0)));
        System.out.println("Description: "+scheduler.getDescription(LocalDateTime.of(2019, 03, 29, 15, 0, 0)));
        System.out.println("Our Anniversary: "+scheduler.getAnniversaryDate());
    }
}
