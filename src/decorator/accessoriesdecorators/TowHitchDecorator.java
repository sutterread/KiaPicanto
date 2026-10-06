package decorator.accessoriesdecorators;

import decorator.KiaPicanto;


public class TowHitchDecorator extends AccessoriesDecorator {
    private KiaPicanto kp;

    public TowHitchDecorator(KiaPicanto kp) {
        this.kp = kp;
    }
    
    @Override
    public String getDescription() {
       return kp.getDescription()+ "Tow hitch / Trailer hitch\n";
    }

    @Override
    public double calculateCost() {
        return 810000 + kp.calculateCost();
    }
    
}
