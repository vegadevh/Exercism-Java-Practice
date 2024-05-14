/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vegadevh.timfrommarketing;

/**
 *
 * @author vegadevh
 */
public class TimFromMarketing {
    
    /*
    Instructions
    In this exercise you'll be writing code to print name badges 
    for factory employees.
    */
    public static void main(String[] args) {
        Badge badge = new Badge();
        Badge badge1 = new Badge();
        System.out.println(badge.print(734, "Ernest Johnny Payne", "Strategic Communication"));
        System.out.println(badge1.print(null, "Ernest Johnny Payne", "Strategic Communication"));
        System.out.println(badge1.print(null, "Ernest Johnny Payne", null));
    }
}
