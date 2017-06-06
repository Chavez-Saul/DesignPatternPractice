/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypeDesign;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Saul
 */
public class Factory {
    
    private static final Map<String, Person> prototypes = new HashMap<>();

    static {
        prototypes.put("phil", new Phil());
        prototypes.put("sally", new Sally());
        prototypes.put("tao", new Tao());
    }

    public static Person getPrototype(String type) {
        try {
            return prototypes.get(type).clone();
        } catch (NullPointerException ex) {
            System.out.println("Prototype with name: " + type + ", doesn't exist");
            return null;
        }
    }
}