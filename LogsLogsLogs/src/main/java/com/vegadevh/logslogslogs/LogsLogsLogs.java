/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vegadevh.logslogslogs;

/**
 *
 * @author vegadevh
 */
public class LogsLogsLogs {
    
    /*
    Instructions
    In this exercise you'll be processing log-lines.

    Each log line is a string formatted as follows: "[<LVL>]: <MESSAGE>".

    These are the different log levels:

    - [TRC] (trace)
    - [DBG] (debug)
    - [INF] (info)
    - [WRN] (warning)
    - [ERR] (error)
    - [FTL] (fatal)
    */
    
    public static void main(String[] args) {
        
        LogLine logLine = new LogLine("[TRC]: File deleted");
        LogLine logLine1 = new LogLine("[DBG]: File deleted");
        LogLine logLine2 = new LogLine("[INF]: File deleted");
        LogLine logLine3 = new LogLine("[WRN]: File deleted");
        LogLine logLine4 = new LogLine("[ERR]: File deleted");
        LogLine logLine5 = new LogLine("[FTL]: File deleted");
        
        System.out.println(logLine.getLogLevel());
        System.out.println(logLine1.getLogLevel());
        System.out.println(logLine2.getLogLevel());
        System.out.println(logLine3.getLogLevel());
        System.out.println(logLine4.getLogLevel());
        System.out.println(logLine5.getLogLevel());
        
        LogLine logLine6 = new LogLine("[XYZ]: File deleted");
        System.out.println(logLine6.getLogLevel());
        
        /*
        The log level of a log line is quite verbose. To reduce the disk space needed to store the log lines, a short format is developed: "[<ENCODED_LEVEL>]:<MESSAGE>".

        The encoded log level is a simple mapping of a log level to a number:

        - UNKNOWN - 0
        - TRACE - 1
        - DEBUG - 2
        - INFO - 4
        - WARNING - 5
        - ERROR - 6
        - FATAL - 42
        
        Implement the LogLine.getOutputForShortLog() method that can output the shortened log line format:
        */
        
        System.out.println(logLine.getOutputForShortLog());
        System.out.println(logLine1.getOutputForShortLog());
        System.out.println(logLine2.getOutputForShortLog());
        System.out.println(logLine3.getOutputForShortLog());
        System.out.println(logLine4.getOutputForShortLog());
        System.out.println(logLine5.getOutputForShortLog());
        System.out.println(logLine6.getOutputForShortLog());
    }
}
