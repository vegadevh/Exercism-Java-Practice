/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vegadevh.wizardsandwarriors;

/**
 *
 * @author vegadevh
 */
public class Warrior extends Fighter{
    
    /*
    For a Warrior, these are the rules:

    - A Warrior is never vulnerable.
    - A Warrior deals 6 points of damage if the fighter they are attacking is not vulnerable.
    - A Warrior deals 10 points of damage if the fighter they are attacking is vulnerable.
    */
    
    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }    
}
