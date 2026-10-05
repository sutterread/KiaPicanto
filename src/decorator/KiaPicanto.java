package decorator;


public abstract class KiaPicanto {
    protected String description;

    public String getDescription() {
        return description;
    }
    
    public abstract double calculateCost();
}
