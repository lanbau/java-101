/* Multiple String Variables in One String */
import java.io.Console;
 
public class TreeStory {
    
    public static void main(String[] args) {
        Console console = System.console();
        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */
        String name = console.readLine("Enter your name: ");
        String adj = console.readLine("Enter adjective :");
        console.printf("%s is very %s", name, adj);
    }
    
}
