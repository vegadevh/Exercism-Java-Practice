/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vegadevh.bookingupforbeauty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        DateTimeFormatter printer = DateTimeFormatter.ofPattern("yyyy, M, dd, H, m, s");
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

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.isAfternoonAppointment() method");
    }

    public String getDescription(LocalDateTime appointmentDate) {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getDescription() method");
    }

    public LocalDate getAnniversaryDate() {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getAnniversaryDate() method");
    }
    
}
