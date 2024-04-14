/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vegadevh.footballmatchreports;

/**
 *
 * @author vegad
 */
public class FootballMatchReports {
   
    /*
    1. Output descriptions of the players based on their shirt number
    
    The team only ever plays a 4-3-3 formation and has never agreed with the 1965
    change to the rules allowing for substitutions, never mind enlarged squads.

    The player descriptions are as follows:

        1 -> "goalie"
        2 -> "left back"
        3 & 4 "center back"
        5 -> "right back"
        6, 7, & 8 -> "midfielder"
        9 -> "left wing"
        10 -> "striker"
        11 -> "right wing"
    
    Implement the static FootballMatchReports.onField()
    method to output a player description based on their shirt number.

        FootballMatchReports.onField(10);
        // => "striker"
    */
    
    /*
    2. Raise an alert if an unknown shirt number is encountered
    
    Modify the FootballMatchReports.onField() method to throw an IllegalArgumentException
    when a shirt number outside the range 1-11 is processed.

        FootballMatchReports.onField(13);
        // => Throw IllegalArgumentException
    */
    
    public static String onField(int shirtNum) throws IllegalArgumentException{
        switch (shirtNum) {
            case 1 -> { 
                return "goalie";
            }
            case 2 -> {
                return "left back";
            }
            case 3, 4 -> {
                return "center back";
            }
            case 5 -> {
                return "right back";
            }
            case 6, 7, 8 -> {
                return "midfielder";
            }
            case 9 -> {
                return "left wing";
            }
            case 10 -> {
                return "striker";
            }
            case 11 -> {
                return "right wing";
            }
            default -> throw new IllegalArgumentException();
        }
   }

//    public static String onField(int shirtNum) throws IllegalArgumentException{
//        String indication;
//        return indication = switch (shirtNum) {
//            case 1 -> "goalie";
//            case 2 -> "left back";
//            case 3, 4 -> "center back";
//            case 5 -> "right back";
//            case 6, 7, 8 -> "midfielder";
//            case 9 -> "left wing";
//            case 10 -> "striker";
//            case 11 -> "right wing";
//            default -> throw new IllegalArgumentException();
//        };
//    }

    public static void main(String[] args) {
        System.out.println(onField(1));
        System.out.println(onField(2));
        System.out.println(onField(3));
        System.out.println(onField(4));
        System.out.println(onField(5));
        System.out.println(onField(6));
        System.out.println(onField(7));
        System.out.println(onField(8));
        System.out.println(onField(9));
        System.out.println(onField(10));
        System.out.println(onField(11));
        System.out.println(onField(12));
    }
}
