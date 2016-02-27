import java.io.Console;
 
public class TreeStory {
    
    public static void main(String[] args) {
        Console console = System.console();
        
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
