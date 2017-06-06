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
public class Tao implements Person{
    
    private final String NAME = "Tao";

    @Override
    public Person clone() {
        return new Tao();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
