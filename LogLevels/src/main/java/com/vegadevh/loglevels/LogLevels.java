/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vegadevh.loglevels;

import java.util.stream.Stream;

/**
 *
 * @author vegadevh
 */
public class LogLevels {
    
    /**
    In this exercise you'll be processing log-lines.

    Each log line is a string formatted as follows: "[<LEVEL>]: <MESSAGE>".

    There are three different log levels:

    - INFO
    - WARNING
    - ERROR
    
    You have three tasks, each of which will take a log line and ask you to do something with it. 
    */

    /**
    Implement the (static) LogLevels.message() method to return a log line's message.
    
    Any leading or trailing white space should be removed:
    */
    static final String TYPE_MESSAGES[] = {"INFO","WARNING","ERROR"};
    
    public static String extractType(String logLine){
        return Stream.of(TYPE_MESSAGES).filter(logLine::contains)
                .findFirst()
                .orElse("The log received was not acceptable.");
    }
    
    public static String message(String logLine) {
        
        String response = extractType(logLine);

        if(response!=null){
            String[] arrayMessages = logLine.split("\\[".concat(response).concat("\\]"));
            arrayMessages = arrayMessages[arrayMessages.length-1].split(":");
            response = arrayMessages[arrayMessages.length-1].trim();
        }
        
        return response;
    }
    
    /**
    Implement the (static) LogLevels.logLevel() method to return a log line's log level, which should be returned in lowercase:
    */
    public static String logLevel(String logLine) {
        String response = extractType(logLine);
        return response.toLowerCase();
    }
    
    /**
    Implement the (static) LogLevels.reformat() method that reformats the log line, putting the message first and the log level after it in parentheses:
    */
    public static String reformat(String logLine) {
        String response = message(logLine).concat(" (").concat(logLevel(logLine).concat(")"));
        return response;
    }
    
    public static void main(String[] args) {
        String logLine = "[ERROR]: Invalid operation";
        String logLine2 = "[INFO]: Operation Completed";
        String logLine3 = "[WARNING]: Disk almost full\r\n";
        
        //Method message()
        System.out.println(message(logLine)); //Invalid operation
        System.out.println(message(logLine2)); //Operation Completed 
        System.out.println(message(logLine3)); //Disk almost full
        
        //Method logLevel()
        System.out.println(logLevel(logLine)); //error
        System.out.println(logLevel(logLine2)); //info
        System.out.println(logLevel(logLine3)); //warning
        
        //Method reformat()
        System.out.println(reformat(logLine)); //Invalid operation (error)
        System.out.println(reformat(logLine2)); //Operation Completed (info)
        System.out.println(reformat(logLine3)); //Disk almost full (warning)
    }
}
