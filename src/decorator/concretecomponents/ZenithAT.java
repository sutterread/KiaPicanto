package decorator.concretecomponents;

import decorator.KiaPicanto;


public class ZenithAT extends KiaPicanto{
    public ZenithAT() {
        description = "Zenith AT\n";
    }

    
    
    @Override
    public double calculateCost() {
        return 105990000;
    }
}
