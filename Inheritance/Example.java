import java.util.Date;
import com.teamtreehouse.Treet;

public class Example {
  
  public static void main(String[] args) {
    Treet treet = new Treet(
      "Irvin Lin",
      "I love Node.JS",
      new Date(1456578869L)
    );
    
    System.out.print(treet.toString());
  
  }
}
