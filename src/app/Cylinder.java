/***********************************************************************
Program Name: Cylinder.java
Programmer's Name: Brandt Lareau
Program Description: Calculate some Cylinder information
***********************************************************************/
package app;

public class Cylinder {
  private double radius = 0.0;
  private double height = 0.0;
  
  // Returns volumn of the cylinder
  public double volume(){    
    return(height * Math.PI * Math.pow(radius, 2));
  }
  
  public Cylinder(Double height, Double radius){
    this.height = height;
    this.radius = radius;
  }
}