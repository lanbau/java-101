public class PezDispenser {

  public final int MAX_PEZ = 12;
  private int mPezCount;
  
  public PezDispenser() {
    mPezCount = 0;
  }
  
  // load pellets
  public void load() {
    mPezCount = MAX_PEZ;
  }
  
  // check if empty & return T/F
  public boolean isEmpty(){
    return mPezCount == 0;
  }
  
}
