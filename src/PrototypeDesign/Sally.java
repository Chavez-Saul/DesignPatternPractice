/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypeDesign;

/**
 *
 * @author Saul
 */
public class Sally implements Person {
    
    private final String NAME = "Sally";

    @Override
    public Person clone() {
        return new Sally();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
