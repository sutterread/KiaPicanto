package decorator.accessoriesdecorators;

import decorator.KiaPicanto;


public class BlackRimDecorator extends AccessoriesDecorator {
    private KiaPicanto kp;

    public BlackRimDecorator(KiaPicanto kp) {
        this.kp = kp;
    }
    
    @Override
    public String getDescription() {
       return kp.getDescription()+ "14\" Machined black alloy rim\n";
    }

    @Override
    public double calculateCost() {
        return 500000 + kp.calculateCost();
    }
    
}
