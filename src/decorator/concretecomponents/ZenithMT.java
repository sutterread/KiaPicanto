package decorator.concretecomponents;

import decorator.KiaPicanto;


public class ZenithMT extends KiaPicanto{

    public ZenithMT() {
        description = "Zenith MT\n";
    }

    
    
    @Override
    public double calculateCost() {
        return 64990000;
    }
    
}
