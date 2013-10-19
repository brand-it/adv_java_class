/***********************************************************************
Program Name: Square.java
Programmer's Name: Brandt Lareau
Program Description: declare a new Square
***********************************************************************/
package app; // Added for my convinonce when it comes to testing


public class Square extends Point {

  public int getArea(){
    return this.getX() * this.getY();
  }
  
  public int perimeter() {
    return (this.getX() + this.getY()) * 2;
  }
}
