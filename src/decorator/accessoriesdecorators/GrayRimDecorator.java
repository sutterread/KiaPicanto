package decorator.accessoriesdecorators;

import decorator.KiaPicanto;


public class GrayRimDecorator extends AccessoriesDecorator {
    private KiaPicanto kp;

    public GrayRimDecorator(KiaPicanto kp) {
        this.kp = kp;
    }
    
    @Override
    public String getDescription() {
       return kp.getDescription()+ "14\" Machined gray alloy rim\n";
    }

    @Override
    public double calculateCost() {
        return 500000 + kp.calculateCost();
    }
    
}
