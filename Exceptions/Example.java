public class Example {
    
    public static void main(String[] args) {
      
        PezDispenser dispenser = new PezDispenser("james");
        System.out.print(dispenser.PezNum());
        
        try {
        
          dispenser.load(400);
          System.out.print("Never Happen");  
          
        } catch (IllegalArgumentException iae) {
        
          System.out.println("Whoa There!");
          System.out.printf("The error was: %s\n", iae.getMessage());
          
        }   
    }
}
