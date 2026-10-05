package decorator.accesoriesdecorators;

import decorator.KiaPicanto;


public class ParkingSensorDecorator extends AccesoriesDecorator{
    private KiaPicanto kp;

    public ParkingSensorDecorator(KiaPicanto kp) {
        this.kp = kp;
    }
    
    @Override
    public String getDescription() {
       return kp.getDescription()+ "Parking sensor\n";
    }

    @Override
    public double calculateCost() {
        return 150000 + kp.calculateCost();
    }
    
}
