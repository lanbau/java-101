import java.io.Console;
 
public class Introductions {
  
    public static void main(String[] args) {
        Console console = System.console();
        
        // Strings
        String firstName = "Irvin";
        String lastName = "Lin";
        
        console.printf("hello world\n");
        console.printf(firstName + " " + lastName + " is learning how to write Java\n");
        
  }
}
