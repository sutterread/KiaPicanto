package decorator.accessoriesdecorators;

import decorator.KiaPicanto;


public class BikeRackDecorator extends AccessoriesDecorator {
    private KiaPicanto kp;

    public BikeRackDecorator(KiaPicanto kp) {
        this.kp = kp;
    }
    
    @Override
    public String getDescription() {
       return kp.getDescription()+ "2-bike rack / Bike carrier\n";
    }

    @Override
    public double calculateCost() {
        return 910000 + kp.calculateCost();
    }
    
}
