/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.notis1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ResourceBundle;

/**
 *
 * @author 14031
 */
public class PropertiesLoader {

    static ResourceBundle resource;
   

    private PropertiesLoader() {
    }

    static {

        resource = ResourceBundle.getBundle("com.service.notis1.new");
        
    }

    public static String getPropValue(String key) {
        String value = "";
        try {
            value = resource.getString(key);

        } catch (Exception ex) {

            ex.printStackTrace();
        }
        return value;
    }
    
   
     
    
}
