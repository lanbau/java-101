public class Example {
    
    public static void main(String[] args) {
        
        // pass in a String name
        PezDispenser dispenser = new PezDispenser("james");
        
        System.out.printf("pez dispenser is %s\n", dispenser.getCharacterName());
        
    }
}
