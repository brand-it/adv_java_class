/***********************************************************************
Program Name: Circle.java
Programmer's Name: Brandt Lareau
Program Description: Draw Circles that or calculate PI
***********************************************************************/
package app;


// Java Extentions 
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Circle {
  DecimalFormat decimal_format = new DecimalFormat("#.######");
  private double radius;
  
  // Init
  public static void main(String args[]) {
    new Circle();
  }
  
  // We are going to set the radius here also can be set in other ways but if we
  // need more complicated logic it is easy to expand on how we set the radius
  public void set_radius(){
    radius = Double.parseDouble(JOptionPane.showInputDialog("Input your radius"));
  }
  
  // What is the message
  public Double diameter(){
    return 2 * radius;
  }
  
  public Double circumference(){
    return 2 * Math.PI * radius;
  }
  
  public Double area(){
    return Math.PI * radius * radius;
  }
  
  // Message
  public String message(){
    return "Diameter: " + decimal_format.format(diameter()) + "\n Circumference: " +  decimal_format.format(circumference()) + "\n Area: " +  decimal_format.format(area()); 
  }
  
  // Display message
  public void display_message(){
    JOptionPane.showMessageDialog(null, message());
  }
  
  // New Event
  public Circle(){
    set_radius();
    display_message();

  }

}