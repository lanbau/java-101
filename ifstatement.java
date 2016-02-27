import java.io.Console;
 
public class TreeStory {
    
    public static void main(String[] args) {
        Console console = System.console();
        
         
        // Get Integer From String
        String weightAsString = console.readLine("Enter Ur Weight: ");
        int weight = Integer.parseInt(weightAsString);
        System.out.print(weight);
      
        // String Equality
        String vulgarwords = console.readLine("If Someone Stepped on Your Feet, What should you say?");
        if (vulgarwords.equals("FUCK YOU")) {
          console.printf("FUCK YOU TOO!");
        } else {
          console.printf("You little bitch!");
        }
      
        // Simple If Statement & Program Exit
        int age = 12;  
        System.out.print(age);
        
        if (age < 13) {
          console.printf("Sorry you are underaged");
          
          // 0 is status code & intentional exiting
          // non zero indicates abnormal termination
          System.exit(0);
        }      
    }
}
