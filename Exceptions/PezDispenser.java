public class PezDispenser {

  public final int MAX_PEZ = 12;
  private int mPezCount;
  
  
  public PezDispenser(String name) {
    mPezCount = 0;
  }
  
  public void load(int pezAmount) {
    
    int newAmount = mPezCount + pezAmount;
    
    // If more than 12 pez, throw exception message.
    if (newAmount > MAX_PEZ) {
    
      throw new IllegalArgumentException("TOO MANY PEZ");
      
    }
    
    mPezCount = newAmount;
  }
  
}
