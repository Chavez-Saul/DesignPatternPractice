/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletons_;

/**
 *
 * @author Saul
 */
public class Singletons_Class {

    private static Singletons_Class myclass = null;
    private Singletons_Class() {}

    public static Singletons_Class getInstance() {
        if(myclass == null) {
            myclass = new Singletons_Class();
        } 
    return myclass;
    }
    
}

