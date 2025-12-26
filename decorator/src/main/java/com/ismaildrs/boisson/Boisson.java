package com.ismaildrs.boisson;

public abstract class Boisson {


    protected String description="boisson ";

     public String getDescription(){
         return description;
     }

     abstract public double  cout();

}
