public class Hangar {

    public static void main (String [] args){
        // Add references to instances of the Car and Boat classes
    Car seat = new Car ("Seat"); 
    Boat lugger = new Boat ("Lugger"); 
        // For each of the references, display the result of the doStuff() method;
    System.out.println("I am a " + seat.getBrand() + " and I go " + seat.doStuff());
    System.out.println("I am a " + lugger.getBrand() + " and I go " + lugger.doStuff());
    }   
        
    
}
