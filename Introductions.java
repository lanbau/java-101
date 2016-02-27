import java.io.Console;
 
public class Introductions {
  
    public static void main(String[] args) {
        Console console = System.console();
        
        // Strings require type declaration unlike in JS var firstName
        String firstName = "Irvin";
        String lastName = "Lin";
        
        console.printf(firstName + " " + lastName + " is learning how to write Java\n");
        
        // Using String variable
        console.printf("%s is learning how to write Java\n", firstName);
        
  }
}
