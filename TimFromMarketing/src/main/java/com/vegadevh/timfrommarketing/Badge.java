/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vegadevh.timfrommarketing;

import java.text.MessageFormat;
import javax.lang.model.type.NullType;

/**
 *
 * @author vegadevh
 */
public class Badge {
    
    /*
    Employees have an ID, name and department name.
    
    Employee badge labels are formatted as follows:
    
        "[id] - name - DEPARTMENT".
    
    Implement the Badge.print() method to return an employee's badge label:
    
    Sample Parameters: 734, "Ernest Johnny Payne", "Strategic Communication"
    
    Result: "[734] - Ernest Johnny Payne - STRATEGIC COMMUNICATION"
    
    */
    
    public String print(Integer id, String name, String department) {
        if(id == null && department == null){
            return name+" - OWNER";
        }else if(id == null){
            return name+" - "+department.toUpperCase();
        }else if(department == null){
            return "["+id+"] - "+name+" - OWNER";
        }else{
            return "["+id+"] - "+name+" - "+department.toUpperCase();
        }
    }
    
}
