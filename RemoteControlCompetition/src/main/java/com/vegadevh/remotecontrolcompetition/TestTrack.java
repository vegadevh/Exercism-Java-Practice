/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vegadevh.remotecontrolcompetition;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author vegadevh
 */
public class TestTrack {
    
    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        Collections.sort(cars, Collections.reverseOrder());
        return cars;
    }
    
}
