/***********************************************************************
Program Name: PracticeArithimeticOperators.java
Programmer's Name: Brandt Lareau
Program Description: Some basic Arithmetic Operations
***********************************************************************/
package app;

// Java Extentions 
import javax.swing.JOptionPane;

public class PracticeArithmeticOperators {
  
  private int first_int;
  private int second_int;
  
  public static void main(String args[]) {
    new PracticeArithmeticOperators();
  }
  
  public void set_first_integer(){
    first_int = Integer.parseInt(JOptionPane.showInputDialog("Input your first integer"));
  }
  
  public void set_second_integer(){
    second_int = Integer.parseInt(JOptionPane.showInputDialog("Input your second intger")); 
  }
  
  public int subtract(){
    return first_int - second_int;
  }
  
  public int add(){
    return first_int + second_int;
  }
  
  public int multiply(){
    return first_int * second_int;
  }
  
  public int divide(){
    try {
      return first_int / second_int; 
    } catch (ArithmeticException e) {
      return 0; // Rather then blowing up when you divide by zero we are just going to return zero
    }
  }
  
  public String divide_message(){
    return first_int + " / " + second_int;
  }
  
  public String add_message(){
    return first_int + " + " + second_int;
  }
  
  public String multiply_message(){
    return first_int + " * " + second_int;
    
  }
  
  public String subtract_message(){
    return first_int + " - " + second_int;
  }
  
  // Not used
  public String message(){
    return  divide_message() + "\n" + add_message() + "\n" + subtract_message() + "\n" + multiply_message();
  }
  
  public void display_message(){
    System.out.format("%-10s%-10s%n", "Operation", "Result");
    System.out.format("%-10s%-10s%n", divide_message(), divide());
    System.out.format("%-10s%-10s%n", add_message(), add());
    System.out.format("%-10s%-10s%n", multiply_message(), multiply());
    System.out.format("%-10s%-10s%n", subtract_message(), subtract());
  }
  
  public PracticeArithmeticOperators(){
    set_first_integer();
    set_second_integer();
    
    display_message();

  }
}