/***********************************************************************
Program Name: Diamond.java
Programmer's Name: Brandt Lareau
Program Description: This will create a dimond BELIEVE IT
***********************************************************************/
package app;

// Don't need every thing just these two
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Diamond {  
  // A simple version of a two dimensional array
  private Integer rows = 0;
  private Integer columns = 0;
  
  // System input
  private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
  // Init
  public static void main(String args[]) {
    new Diamond();
  }
  

   /*  Number of rows is 9
               *
              ***
             *****
            *******
           *********
            *******
             *****
              ***
               *
    */
  public void diamondOfAsterisks(){
    
    // Not that rows are also the total width of the columns
    System.out.println("Total number of rows: " + rows);
    String row = "";
    for (int r = 1; r < rows; r += 2) {
      for (int c = 0; c <= (rows / 2) - (r / 2); c++){
        row += " ";
      }
    
      for (int j = 0; j < r; j++){
        row += "*";
      }
      System.out.println(row);
      row = "";
    }
    
    // Bottom: not counting the rows but rather the total number of asterisks in the row
    for (int r = rows; r > 0; r -= 2) {
      for (int c = 0; c < (rows / 2) - (r / 2); c++){
        row += " ";
      }
        System.out.print(" ");
    
      for (int c = 0; c < r; c++){
        row += "*";
      }
      System.out.println(row);
      row = "";
    }
  }
  
  public void test_diamond(){
    for(int i = 0; i < 100; i++){
      if (i % 2 != 0 || i <= 1){
        rows = i;
        diamondOfAsterisks();
      }
    }
  }
  
  public void ask_how_many_rows() {
    do {
      try {
        System.out.print("How many rows do you want it must be a odd number: ");
        rows = Integer.parseInt(br.readLine());
      } catch (NumberFormatException exception) {
        System.out.println("Please Enter a valid Number");
      } catch (IOException exception) {
        System.out.println(exception);
      }
      } while (rows % 2 == 0 || rows <= 1);
    }
  
    // New Event
    public Diamond(){
      ask_how_many_rows();
      // test_diamond();
      diamondOfAsterisks();
    }
  }


