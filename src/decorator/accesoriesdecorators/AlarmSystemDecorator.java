package decorator.accesoriesdecorators;

import decorator.KiaPicanto;


public class AlarmSystemDecorator extends AccesoriesDecorator{
    private KiaPicanto kp;

    public AlarmSystemDecorator(KiaPicanto kp) {
        this.kp = kp;
    }
    
    @Override
    public String getDescription() {
       return kp.getDescription()+ "General alarm system (2 remotes)\n";
    }

    @Override
    public double calculateCost() {
        return 205000 + kp.calculateCost();
    }
    
}
