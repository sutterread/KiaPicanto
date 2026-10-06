package decorator.accessoriesdecorators;

import decorator.KiaPicanto;


public class AlloyRimDecorator extends AccessoriesDecorator {
    private KiaPicanto kp;

    public AlloyRimDecorator(KiaPicanto kp) {
        this.kp = kp;
    }
    
    @Override
    public String getDescription() {
       return kp.getDescription()+ "13\" / 14\" Alloy wheel / Rim";
    }

    @Override
    public double calculateCost() {
        return 350000 + kp.calculateCost();
    }
    
}
