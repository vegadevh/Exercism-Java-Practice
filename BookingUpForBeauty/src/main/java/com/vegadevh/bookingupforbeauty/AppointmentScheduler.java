/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vegadevh.bookingupforbeauty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author vegadevh
 */
public class AppointmentScheduler {
    
    /*
    Implement the AppointmentScheduler.schedule() method to parse a textual representation
    of an appointment date into the corresponding LocalDateTime
    
    input: "7/25/2019 13:45:00"
    output: => LocalDateTime.of(2019, 7, 25, 13, 45, 0)
    */
    
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("M/dd/yyyy H:m:ss");
        
        //"7/25/2019 13:45:00"
        LocalDateTime localDateTime = LocalDateTime.parse(appointmentDateDescription, formater);
        LocalDateTime localDateTime1 = 
                LocalDateTime.of(
                        localDateTime.getYear(),
                        localDateTime.getMonth(),
                        localDateTime.getDayOfMonth(),
                        localDateTime.getHour(),
                        localDateTime.getMinute(),
                        localDateTime.getSecond());
        
        return localDateTime1;
    }
    
    /*
    Implement the AppointmentScheduler.hasPassed() method
    that takes an appointment date and checks if the appointment was somewhere in the past
    */

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime actualDateTime = LocalDateTime.now();
        return appointmentDate.isBefore(actualDateTime);
    }
    
    /*
    Implement the AppointmentScheduler.isAfternoonAppointment() method
    that takes an appointment date and checks if the appointment is
    in the afternoon (>= 12:00 and < 18:00)
    
    input: LocalDateTime.of(2019, 03, 29, 15, 0, 0)
    output: true
    
    */
    
    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    /*
    Implement the AppointmentScheduler.getDescription() method
    that takes an appointment date and returns a description of that date and time
    
    input: LocalDateTime.of(2019, 03, 29, 15, 0, 13)
    output: "You have an appointment on Friday, March 29, 2019, at 3:15 PM."
    */
    public String getDescription(LocalDateTime appointmentDate) {
        return String.format("You have an appointment on %s, %s %d, %d, at %s.",
                appointmentDate.getDayOfWeek().toString().substring(0, 1)+appointmentDate.getDayOfWeek().toString().substring(1).toLowerCase(),
                appointmentDate.getMonth().toString().substring(0, 1)+appointmentDate.getMonth().toString().substring(1).toLowerCase(),
                appointmentDate.getDayOfMonth(),
                appointmentDate.getYear(),
                appointmentDate.format(DateTimeFormatter.ofPattern("h:mm a"))                
        );
    }
    
    /*
    Implement the AppointmentScheduler.getAnniversaryDate() method
    that returns this year's anniversary date, which is September 15th
    */

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
    
}
