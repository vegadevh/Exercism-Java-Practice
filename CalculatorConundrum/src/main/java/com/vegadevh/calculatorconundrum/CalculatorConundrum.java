/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vegadevh.calculatorconundrum;

/**
 *
 * @author vegad
 */
public class CalculatorConundrum {
    
    /*
    Instructions
    
    In this exercise you will be building error handling for a simple integer calculator.
    To make matters simple, methods for calculating addition, multiplication and division are provided.

    The goal is to have a working calculator that returns a String
    with the following pattern: 16 + 51 = 67, when provided with arguments 16, 51 and +.
    */
    
    /*
    
    The main method for implementation in this task will be the 
    CalculatorConundrum.calculate() method. It takes three arguments.
    The first two arguments operand1 and operand2 are integer numbers on which
    an operation is going to operate.
    
    The third argument operation is of type String and for this exercise
    it is necessary to implement the following operations:

        - addition using the + String
        - multiplication using the * String
        - division using the / String
    
    */
    
    public String calculate(int operand1, int operand2, String operation) throws IllegalArgumentException, IllegalArgumentException{
        String resolved= "";
        if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        try {
            resolved = switch (operation) {
                case "+" -> String.format("%d + %d = %s", operand1, operand2, Integer.toString(operand1+operand2));
                case "*" -> String.format("%d * %d = %s", operand1, operand2, Integer.toString(operand1*operand2));
                case "/" -> String.format("%d / %d = %s", operand1, operand2, Integer.toString(operand1/operand2));
                case "" -> throw new IllegalArgumentException("Operation cannot be empty");
                default -> throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
            };
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
        return resolved;
    }
    
    public static void main(String[] args) {
        CalculatorConundrum calculatorConundrum = new CalculatorConundrum();
        
        System.out.println(calculatorConundrum.calculate(10, 5, "+"));
        System.out.println(calculatorConundrum.calculate(10, 5, "*"));
        System.out.println(calculatorConundrum.calculate(10, 5, "/"));
        System.out.println(calculatorConundrum.calculate(10, 0, "/"));
        System.out.println(calculatorConundrum.calculate(10, 5, "**"));
    }
}
