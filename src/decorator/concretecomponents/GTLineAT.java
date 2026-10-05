package decorator.concretecomponents;

import decorator.KiaPicanto;


public class GTLineAT extends KiaPicanto{
    public GTLineAT() {
        description = "GT Line AT\n";
    }

    
    
    @Override
    public double calculateCost() {
        return 93990000;
    }
}
