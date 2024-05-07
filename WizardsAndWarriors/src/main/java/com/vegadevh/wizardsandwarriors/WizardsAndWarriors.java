/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vegadevh.wizardsandwarriors;

/**
 *
 * @author vegadevh
 */
public class WizardsAndWarriors {
    
    /*
    Instructions
    In this exercise you're playing a role-playing game where different types of fighters can combat each other.
    The game has different rules for each type of fighter. 
    We are going to focus on two specific types: Wizards and Warriors.
    */

    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Warrior warrior = new Warrior();
        
        wizard.toString();
        warrior.toString();
        
        //Warrior attack wizard and it was not prepared!
        
        System.out.println("Warrior attacks! Wizard lose "+warrior.getDamagePoints(wizard)+" points of life");
        
        //Wizzard prepare an attack!
        wizard.prepareSpell();
        System.out.println("The wizard prepare an spell! So, it's vulnerable? ... "+ wizard.isVulnerable() +"!");
        
        System.out.println("Warrior attacks! Wizard lose "+warrior.getDamagePoints(wizard)+" points of life!");
        System.out.println("Wizard attacks! Warrior lose "+wizard.getDamagePoints(warrior)+" points of life!");
        
    }
}
