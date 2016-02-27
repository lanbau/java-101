public class Example {
    
    public static void main(String[] args) {
      
        PezDispenser dispenser = new PezDispenser("james");
        
        Boolean result = dispenser.isEmpty();
        System.out.print(result);
        
        // Now add the pez pellets
        dispenser.load();
      
        Boolean resultAfterLoad = dispenser.isEmpty();
        System.out.print(resultAfterLoad);
    }
}
