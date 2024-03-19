/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vegadevh.annalynsinfiltration;

import java.util.stream.Stream;

/**
 *
 * @author dvega
 */
public class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if((knightIsAwake == true && !(archerIsAwake && prisonerIsAwake)) || 
            (archerIsAwake == true && !(knightIsAwake && prisonerIsAwake)) || 
            (prisonerIsAwake == true && !(archerIsAwake && knightIsAwake))){
            return true;
        }else if(knightIsAwake && archerIsAwake && prisonerIsAwake){
            return true;
        }else{
            return false;
        } 
//        return Stream.of(knightIsAwake,archerIsAwake, prisonerIsAwake).anyMatch(Boolean.TRUE::equals);
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return archerIsAwake == false && prisonerIsAwake == true;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent){
            return !archerIsAwake;
        }else {
            if(prisonerIsAwake == true && archerIsAwake == false && knightIsAwake == false){
                return true;
            }else{
                return false;
            }
        }
    }
    
    public static void main(String[] args) {
        Boolean knightIsAwake = false;
        Boolean archerIsAwake = false;
        Boolean prisonerIsAwake = false;
        Boolean petDogIsPresent = false;
        
        System.out.println("CanFastAttack " + canFastAttack(true));
        System.out.println("CanSpy " + canSpy(true, true, true));
        System.out.println("CanSignalPrisoner " + canSignalPrisoner(true, true));
        System.out.println("CanFreePrisoner " + canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
    }
}