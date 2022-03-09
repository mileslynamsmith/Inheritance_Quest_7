public class Boat extends Vehicle {
    
    public Boat(String brand) {  
	    super(brand);
	}
  
    @Override
    public String doStuff() {
        return "glug glug";
    }
}
