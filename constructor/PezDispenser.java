public class PezDispenser {
  private String mCharacterName = "yoda"; 
  
  // type of PezDispenser, constructor is a class method to instantiate an object
  public PezDispenser(String name) {
  
    // you can see the importance of the m prefix
    mCharacterName = name;
    
  }
  
  public String getCharacterName() {
    return mCharacterName;
  }
}
