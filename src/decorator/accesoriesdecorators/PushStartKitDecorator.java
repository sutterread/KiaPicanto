package decorator.accesoriesdecorators;

import decorator.KiaPicanto;


public class PushStartKitDecorator extends AccesoriesDecorator{
    private KiaPicanto kp;

    public PushStartKitDecorator(KiaPicanto kp) {
        this.kp = kp;
    }
    
    @Override
    public String getDescription() {
       return kp.getDescription()+ "Push-start button and alarm kit\n";
    }

    @Override
    public double calculateCost() {
        return 1500000 + kp.calculateCost();
    }
    
}
