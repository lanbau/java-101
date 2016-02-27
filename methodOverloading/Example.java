//Method Overloading is a feature that allows a class to have two or more methods having same name, if their argument lists are different. 
public class Example {
    
    public static void main(String[] args) {
      
        PezDispenser dispenser = new PezDispenser("james");
        
        //Load 12 Bullets with First Load Method
        dispenser.load();
        System.out.print(dispenser.PezNum());
        
        //Load 4 Bullets using Second Load Method
        dispenser.load(4);
        System.out.print(dispenser.PezNum());
        
        //Load 2 Bullets using Second Load Method
        dispenser.load(2);
        System.out.print(dispenser.PezNum());
        
        //Call First Load Method
        dispenser.load();
        System.out.print(dispenser.PezNum());

    }
}
