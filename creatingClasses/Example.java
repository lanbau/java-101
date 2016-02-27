// Y NO IMPORT?! java io import is needed for i/o
public class Example {
    public static void main(String[] args) {
        System.out.println("yoda is green");
        
        // Create Object dispenser
        PezDispenser dispenser = new PezDispenser();
        
        // Now you can access Object's state e.g name
        System.out.printf("pez dispenser is %s\n", dispenser.mCharacterName);
    }
}
