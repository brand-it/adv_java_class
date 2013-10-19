/***********************************************************************
Program Name: Point.java
Programmer's Name: Brandt Lareau
Program Description: declare a new Cube
***********************************************************************/
package app; // Added for my convinonce when it comes to testing

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Point {
  
  private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
  private int x = 0;
  private int y = 0;
  private int z = 0;
  
  
  // Init
  public static void main(String args[]) {
    Point point = new Square();
    point.getPoints();
    System.out.println(point.getArea()); // this is dependent on calling the right a class below this on
  }
  
  public int getArea(){
    return 0;
  }
  
  public int getX() {
    return x;
  }
  
  public int getY() {
    return y;
  }
  
  public int getZ() {
    return z;
  }

  
  public void getPoints(){
    do {
      System.out.println("Please input a number that greater then zero");
      try {
        System.out.print("Please input x: ");
        x = Integer.parseInt(br.readLine());
        
        System.out.print("Please input y: ");
        y = Integer.parseInt(br.readLine());
        
        System.out.print("Please input z: ");
        z = Integer.parseInt(br.readLine());
        
      } catch (NumberFormatException exception) {
        System.out.println("Please Enter a valid Number");
      } catch (IOException exception) {
        System.out.println(exception);
      } 
      } while (this.x <= 0 && this.x <= 0 && this.x <= 0);
      
      System.out.println("Your (x, y, z) is (" + x + ", " + y + ", " + z + ")");
      
  }
}
