package decorator;

import decorator.accesoriesdecorators.AlarmSystemDecorator;
import decorator.accesoriesdecorators.BikeRackDecorator;
import decorator.accesoriesdecorators.CargoNetDecorator;
import decorator.accesoriesdecorators.ParkingSensorDecorator;
import decorator.accesoriesdecorators.WheelLocksDecorator;
import decorator.concretecomponents.GTLineAT;
import decorator.concretecomponents.VibrantMT;
import decorator.concretecomponents.ZenithMT;


public class Main {

    public static void main(String[] args) {
        KiaPicanto kp = new GTLineAT();
        System.out.println(kp.getDescription()+" $ "+kp.calculateCost()+" COP\n");
        
        KiaPicanto kp2 = new VibrantMT();
        System.out.println("Descripcion inicial: "+kp2.getDescription()+" $ "+kp2.calculateCost()+" COP\n");
        kp2 = new AlarmSystemDecorator(kp2);
        kp2 = new BikeRackDecorator(kp2);
        kp2 = new BikeRackDecorator(kp2);
        System.out.println("Descripcion final: "+ kp2.getDescription()+" $ "+kp2.calculateCost()+" COP\n");
        
        
        KiaPicanto kp3 = new ZenithMT();
        System.out.println("Descripcion inicial: "+kp3.getDescription()+" $ "+kp3.calculateCost()+" COP\n");
        kp3 = new CargoNetDecorator(kp3);
        kp3 = new ParkingSensorDecorator(kp3);
        kp3 = new WheelLocksDecorator(kp3);
        System.out.println("Descripcion final: "+ kp3.getDescription()+" $ "+kp3.calculateCost()+" COP\n");
    }
    
}
