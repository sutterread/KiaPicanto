package decorator.accessoriesdecorators;

import decorator.KiaPicanto;


public class AlarmSystemDecorator extends AccessoriesDecorator {
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
