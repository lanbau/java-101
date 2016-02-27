package com.teamtreehouse;

import java.util.Date;

public class Treet {
  //immutable variables
  private String mAuthor;
  private String mDescription;
  private Date mCreationDate;
  
  //constructor
  public Treet(String author, String description, Date creationDate) {
    mAuthor = author;
    mDescription = description;
    mCreationDate = creationDate;
  }
  
  //NOTE! all methods must have RETURN TYPE Declared!
  public String getAuthor() {
    return mAuthor;
  }
  
  public String getDescription() {
    return mDescription;
  }
  
  public Date getCreationDate() {
    return mCreationDate;
  }
}
