/***********************************************************************
Program Name: Largest.java
Programmer's Name: Brandt Lareau
Program Description: Finds the largest number
***********************************************************************/
package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Largest {
  Integer total_integers = 10;
  private int[] integers_array = new int[total_integers];
  
  private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
  
  // Init
  public static void main(String args[]) {
    new Largest();
  }
  
  public void print_array(){
    int count = 0;
    while(count < total_integers){
      System.out.println((count + 1) + ": " + integers_array[count]);
      count++;
    }
  }
  
  public void largets_number(){
    sort_array();    
    System.out.println("Largest number: " + integers_array[total_integers - 1]);
  }
  
  public void sort_array(){
    Arrays.sort(integers_array);
  }
  
  public void ask_for_numbers() {
    int count = 0;
    while (count < total_integers) {
      try {
        System.out.print("Input number (" + (count + 1) + "): ");
        integers_array[count] = Integer.parseInt(br.readLine());
        count++;
        
      } catch (NumberFormatException exception) {
        System.out.println("Please Enter a valid Number");
      } catch (IOException exception) {
        System.out.println(exception);
      }      
    };
  }
  
  // New Event
  public Largest(){
    ask_for_numbers();
    sort_array();
    print_array();
    largets_number();
  }
  
}