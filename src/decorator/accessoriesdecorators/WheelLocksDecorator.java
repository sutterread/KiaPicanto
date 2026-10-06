package decorator.accessoriesdecorators;

import decorator.KiaPicanto;


public class WheelLocksDecorator extends AccessoriesDecorator {
    private KiaPicanto kp;

    public WheelLocksDecorator(KiaPicanto kp) {
        this.kp = kp;
    }
    
    @Override
    public String getDescription() {
       return kp.getDescription()+ "Wheel lock bolts\n";
    }

    @Override
    public double calculateCost() {
        return 156100 + kp.calculateCost();
    }
    
}
