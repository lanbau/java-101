//folder structure: com -> teamtreehouse -> Treet.java

import java.util.Date;
import com.teamtreehouse.Treet;

public class Example {
  
  public static void main(String[] args) {
    Treet treet = new Treet(
      "Irvin Lin",
      "I love Node.JS",
      new Date(1456578869L)
      //epoch converter
    );
    System.out.printf("this is a new %s %n", treet);
    System.out.print(treet.getCreationDate());
  }
}
