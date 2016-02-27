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
  
  // override inheritied method toString
  @Override
  public String toString() {
    return "Treet";
  }
}
