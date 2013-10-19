/***********************************************************************
Program Name: Palindrome.java
Programmer's Name: Brandt Lareau
Program Description: Finds the largest number
***********************************************************************/
package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Palindrome {
  
  Integer integer;
  private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
  
  // Init
  public static void main(String args[]) {
    new Palindrome();
  }
  
  public void ask_for_number() {
    boolean is_true = true;
    do  {
      try {
        System.out.print("Type in a integer and I will tell you if it is palindrome: ");
        integer = Integer.parseInt(br.readLine());
        is_true = false;
        
      } catch (NumberFormatException exception) {
        System.out.println("Please Enter a valid Number");
      } catch (IOException exception) {
        System.out.println(exception);
      }      
      } while(is_true);
    }
  
    public int reverse_number(Integer number){
      int reversed_number = 0;
      while(number != 0){
        reversed_number = (reversed_number * 10) + (number % 10);
        number = number / 10;
      }
      return reversed_number;
    }
  
    public void is_palindrome(){
      if (reverse_number(integer) == integer){
        System.out.println("This integer is palindrome");
      } else {
        System.out.println("This integer is not palindrome");
      }
    }
  
    public Palindrome(){
      ask_for_number();
      is_palindrome();
    }
  }