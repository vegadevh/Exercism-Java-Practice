/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vegadevh.salarycalculator;

/**
 *
 * @author vegad
 */
public class SalaryCalculator {
    
    /*
    Introduction
    Ternary Operators
    The ternary operator is a lightweight, compact alternative for simple if/else statements.
    Usually used in (but not restricted to) return statements, it needs just one single line to make the decision,
    returning the left value if the expression is true and the right value if false, as follows:
    
    *********
    boolean expr = 0 != 200;

    // Ternary statement
    int value = expr ? 22 : 33;
    // => 22
    *********    
    
    A lot of simple if/else expressions can be simplified using ternary operators.
    
    */
    
    /*
    Instructions
    
    In this exercise, you'll be implementing rules for calculating the total salary
    of a employee in a month.
    The International Siderurgy Company (ISC) requires assistance in calculating employee salaries,
    considering various factors that can impact the final wage.

    You have three tasks, and you should use the ternary operator
    instead of if/else statements to implement them.
    */
    
    /*
    1. Determine the salary multiplier
    Implement the salaryMultiplier method, which returns the salary multiplier
    based on the number of days an employee skipped work.
    Apply a 15% penalty if the employee skipped at least five days.
    
    ***********
    int daysSkipped = 3;
    salaryMultiplier(daysSkipped);
    // => 1.0

    daysSkipped = 7;
    salaryMultiplier(daysSkipped);
    // => 0.85
    ***********
    */
    
    public double salaryMultiplier(int daysSkipped) {
        double multiplier = 1.0;
        double penalty = 0.15;
        return daysSkipped >= 5 ? multiplier - multiplier*penalty : multiplier ;
    }
    
    /*
    2. Calculate the bonus for products sold
    Implement the bonusMultiplier and bonusForProductsSold methods.
    The ISC pays ten monetary units for each product sold, and if an employee sells
    twenty products or more, the multiplier improves to thirteen.
    
    bonusMultiplier should determine which multiplier to apply, and bonusForProductSold
    should return the total bonus in monetary units.

    ************
    int productsSold = 21;
    bonusMultiplier(productsSold);
    // => 13
    bonusForProductsSold(productsSold);
    // => 273

    productsSold = 5;
    bonusMultiplier(productsSold);
    // => 10
    bonusForProductsSold(productsSold);
    // => 50
    ************
    */
    
    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10 ;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }
    
    /*
    3. Calculate the final salary for the employee
    
    Implement the finalSalary method.
    It should multiply the base salary of 1000.00 by the salary multiplier,
    add the bonus, and return the result. However, salaries should be capped at 2000.00.

    **********
    int daysSkipped = 2;
    int productsSold = 3;
    finalSalary(daysSkipped, productsSold);
    // => 1030.00

    productsSold = 90;
    finalSalary(daysSkipped, productsSold);
    // => 2000.00
    **********
    */
    
    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = 1000.00;
        return (baseSalary * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold) > 2000 
                ? 2000 
                : (baseSalary * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold); 
    } 

    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        int productsSold = 3;
        int daysSkipped = 2;
        
        System.out.println(salaryCalculator.salaryMultiplier(5));
        System.out.println(salaryCalculator.bonusMultiplier(productsSold));
        System.out.println(salaryCalculator.bonusForProductsSold(productsSold));
        
        System.out.println(salaryCalculator.finalSalary(daysSkipped, productsSold));
        productsSold = 90;
        System.out.println(salaryCalculator.finalSalary(daysSkipped, productsSold));
    }
}
