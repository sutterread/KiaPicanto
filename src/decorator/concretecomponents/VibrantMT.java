package decorator.concretecomponents;

import decorator.KiaPicanto;


public class VibrantMT extends KiaPicanto{

    public VibrantMT() {
        description= "Vibrant MT\n";
    }

    
    @Override
    public double calculateCost() {
        return 57990000;
    }
    
    
    
}
