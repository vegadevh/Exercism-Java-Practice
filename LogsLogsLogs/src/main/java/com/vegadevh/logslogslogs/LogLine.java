/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vegadevh.logslogslogs;

/**
 *
 * @author vegadevh
 */
public class LogLine {
    
    private String value;
    
    public enum LogLevel {
        TRACE(1),
        DEBUG(2),
        INFO(3),
        WARNING(4),
        ERROR(5),
        FATAL(6),
        UNKNOWN(0);
        
        private final int encode_level;
        
        LogLevel(int encode_level) {
            this.encode_level = encode_level;
        }

        public int getEncode_level() {
            return encode_level;
        }
    }
    
    public LogLine(String logLine) {
        this.value = logLine;
    }

    public LogLevel getLogLevel() {
        return switch(this.value.substring(1, 4)){
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        return switch(this.value.substring(1,4)){
            case "TRC" -> LogLevel.TRACE.getEncode_level()+":"+this.value.substring(7);
            case "DBG" -> LogLevel.DEBUG.getEncode_level()+":"+this.value.substring(7);
            case "INF" -> LogLevel.INFO.getEncode_level()+":"+this.value.substring(7);
            case "WRN" -> LogLevel.WARNING.getEncode_level()+":"+this.value.substring(7);
            case "ERR" -> LogLevel.ERROR.getEncode_level()+":"+this.value.substring(7);
            case "FTL" -> LogLevel.FATAL.getEncode_level()+":"+this.value.substring(7);
            default -> LogLevel.UNKNOWN.getEncode_level()+":"+this.value.substring(7);
        };
    }
}
