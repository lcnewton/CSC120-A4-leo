public class Engine implements EngineRequirements {
    // Attributes
    public FuelType fuelType; // Type of fuel used
    public double fuelCurrent; // Current amount of fuel
    public double fuelMax; // Maximum fuel able to be stored

    /*
     * Constructor
     */

    public Engine(FuelType fuelType, double fuelCurrent, double fuelMax) {
        this.fuelCurrent = fuelCurrent;
        this.fuelMax = fuelMax;
        this.fuelType = fuelType;
    }

    /* 
    Methods
     */

    public void refuel(){
        fuelCurrent = fuelMax;
    }

    public FuelType getFuelType(){
        return fuelType;
    }
    
    public double getMaxFuel(){
        return fuelMax;
    }
    public double getCurrentFuel(){
        return fuelCurrent;
    } 

    public Boolean go(){
        if (fuelCurrent>0) {
            fuelCurrent-=1;
            System.out.println("Choo Choo! Current fuel level at "+ fuelCurrent);
            return true;    
        }
        else {
            System.out.println("Out of fuel.");
            return false;
        }    
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 0.0, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}

