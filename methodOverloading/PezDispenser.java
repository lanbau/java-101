public class PezDispenser {
  public final int MAX_PEZ = 12;
  private int mPezCount;
  
  public PezDispenser(String name) {
    mPezCount = 0;
  }
  
  public void load() {
    load(MAX_PEZ);
  }
  
  // method overloading
  public void load(int pezAmount) {
    mPezCount += pezAmount;
  }
  
  public int PezNum() {
    return mPezCount;
  }
}
