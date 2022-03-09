public abstract class Vehicle {

    // Attributes 
    private String brand;
    private int kilometre;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
        this.kilometre = 0;
    }
    // getters and setters 
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getKilometre(){
        return this.kilometre;
    }
    public void setKilometre (int kilometre){
        this.kilometre = kilometre;
    }
    // Add abstract Method doStuff
    public abstract String doStuff();

}