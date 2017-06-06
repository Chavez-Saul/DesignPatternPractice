/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Saul
 */
// a factory for creating Intel Cpu or Mmu
public class IntelToolkit extends AbstractFactory {
    
    public CPU createCPU() {
        return new IntelCPU();
    }
    
    public MMU createMMU() {
        return new IntelMMU();
    }
}
