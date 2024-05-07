/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vegadevh.wizardsandwarriors;

/**
 *
 * @author vegadevh
 */
public class Wizard extends Fighter{
    
    boolean spell = false;
    
    /*
    For a Wizard, these are the rules:

    - A Wizard can prepare a spell in advance.
    - A Wizard is vulnerable unless they have prepared a spell in advance.
    - A Wizard deals 12 points of damage if they prepared a spell in advance.
    - A Wizard deals 3 points of damage if they did not prepare a spell in advance.
    */
    
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        return this.spell ? false : true;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return this.spell ? 12 : 3;
    }
    
    public void prepareSpell(){
        this.spell = true;
    }
}
