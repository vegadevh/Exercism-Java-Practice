/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vegadevh.squeakyclean;

import java.util.HashMap;

/**
 *
 * @author vegadevh
 */
public class SqueakyClean {
    
    /**
     * Implement the (static) SqueakyClean.clean() method to replace any spaces with underscores.
     * This also applies to leading and trailing spaces.
     */
    
    /**
     * Modify the (static) SqueakyClean.clean() method to convert kebab-case to camelCase.
     */
    
    /**
     * Modify the (static) SqueakyClean.clean()
     * method to convert leetspeak to normal text.
     * For simplicity we will only be using 4, 3, 0, 1 and 7 from the table.
     */
    
    /**
     * Modify the (static) SqueakyClean.clean() method to omit any characters that are not letters.
     */
    
    static String clean(String identifier) {
        identifier = identifier.replaceAll(" ", "_");
        String [] identifiers = identifier.split("-");
        
        identifier="";
        String response = "";
        
        System.out.println("------------");
        for (String id : identifiers) {
            System.out.println(id);
        }
        System.out.println("------------");
        
        for (int i = 0; i < identifiers.length; i++) {
            identifiers[i] = identifiers[i].replaceAll("[$&+,:;=?@#|'<>.^*()%!¡-]", "");
            if(i>0){
                if(Character.isLetter(identifiers[i].charAt(0))){
                    response = response.concat(identifiers[i].substring(0, 1).toUpperCase() + (identifiers[i].substring(1)));
                }else{
                    response = response.concat(identifiers[i]);
                }
            }else{
                response = response.concat(identifiers[i]);
            }
        }
        response = response.replaceAll("4", "a");
        response = response.replaceAll("3", "e");
        response = response.replaceAll("0", "o");
        response = response.replaceAll("1", "l");
        response = response.replaceAll("7", "t");
        return response;
    }

    public static void main(String[] args) {
//        System.out.println(clean("@#$%  #muchas  - gr  acias - hola!"));
        System.out.println(clean("¡1337sp34k is fun!"));
    }
}
