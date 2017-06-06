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
abstract class AbstractFactory {
    
    private static final IntelToolkit INTEL_TOOLKIT = new IntelToolkit();
    private static final AMDToolkit AMD_TOOLKIT = new AMDToolkit();

    // Returns a concrete factory object that is an instance of the
    // concrete factory class appropriate for the given architecture.
    static AbstractFactory getFactory(Architecture architecture) {
        AbstractFactory factory = null;
        switch (architecture) {
            case Intel:
               factory = INTEL_TOOLKIT;
            case AMD:
                factory = AMD_TOOLKIT;
        }
        return factory;
    }

    public abstract CPU createCPU();

    public abstract MMU createMMU();
}

enum Architecture {
    Intel, AMD;
}

