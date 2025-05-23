public class Car extends Vehicle{
    private String typeEngine;
    public String getTypeEngine() {
        return typeEngine;
    }
    public void setCarInfo(int s, String t, String y) {
        this.setFuel(s);
        this.setTopSpeed(t);
        typeEngine = y;
    }
    public void setTypeEngine(String t) {
        typeEngine = t;
    }
    public void move() {
        if (this.getFuel() > 50) {
            this.setFuel(this.getFuel() - 50) ;
            System.out.println("Move.");
        } else {
            System.out.println("Please add fuel.");
        }
    }
    public void showCarInfo() {
        System.out.println("Car engine is "+ typeEngine+".");
        System.out.println("Fuel is "+this.getFuel()+" litre and Top Speed is "+this.getTopSpeed()+" m/s.");
    }
}
