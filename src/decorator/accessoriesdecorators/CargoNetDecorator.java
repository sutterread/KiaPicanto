package decorator.accessoriesdecorators;

import decorator.KiaPicanto;


public class CargoNetDecorator extends AccessoriesDecorator {

    private KiaPicanto kp;

    public CargoNetDecorator(KiaPicanto kp) {
        this.kp = kp;
    }
    
    @Override
    public String getDescription() {
       return kp.getDescription()+ "Cargo net\n";
    }

    @Override
    public double calculateCost() {
        return 110000 + kp.calculateCost();
    }
    
}
