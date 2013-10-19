/***********************************************************************
Program Name: Cube.java
Programmer's Name: Brandt Lareau
Program Description: declare a new Cube
***********************************************************************/
package app; // Added for my convinonce when it comes to testing


public class Cube extends Point {
  
  public int getArea(){
    return this.getX() * this.getY() * this.getY();
  }
}
