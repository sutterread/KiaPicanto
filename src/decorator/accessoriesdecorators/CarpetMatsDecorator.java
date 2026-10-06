package decorator.accessoriesdecorators;

import decorator.KiaPicanto;


public class CarpetMatsDecorator extends AccessoriesDecorator {
    private KiaPicanto kp;

    public CarpetMatsDecorator(KiaPicanto kp) {
        this.kp = kp;
    }
    
    @Override
    public String getDescription() {
       return kp.getDescription()+ "Three-piece carpet mats\n";
    }

    @Override
    public double calculateCost() {
        return 92000 + kp.calculateCost();
    }
    
}
