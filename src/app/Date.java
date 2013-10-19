/***********************************************************************
Program Name: Date.java
Programmer's Name: Brandt Lareau
Program Description: It is trying to print out the date
***********************************************************************/
package app;

import java.util.Calendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Date {
  Calendar calender = Calendar.getInstance();  
  // System input
  private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
  // Init
  public static void main(String args[]) {
    new Date();
  }
  
  public void nextDay(){
    calender.add(Calendar.DATE, 1);
  }
  
  public void nextMonth(){
    calender.add(Calendar.MONTH, 1);
  }
  
  public void nextYear(){
    calender.add(Calendar.YEAR, 1);
    
  }
  
  public void runTests(){
    
    do {
      try {
        System.out.println("Your Date is set to: " + calender.getTime());
        System.out.println("Going to the next day");
        nextDay();
      
        Thread.sleep(1000);
        } catch (InterruptedException exception){
          
        }

      } while(true);    
    }
  
  // Rather then creating a error on the system imput date we are going to use a smart calender
  // Say for example you type in 32 on Jan rather then freeking out and not working it just goes over to the next month
  // Samething with the month and all the other values well except year
  public void setDate(){
    Boolean done = false;
    do {
      try {
        System.out.print("Input Month: ");
        
        calender.set(Calendar.MONTH, Integer.parseInt(br.readLine()) - 1);
        System.out.print("Input Day of Month: ");
         
        calender.set(Calendar.DATE, Integer.parseInt(br.readLine()));
        System.out.print("Input Year: ");
         
        calender.set(Calendar.YEAR, Integer.parseInt(br.readLine()));
        
        done = true;
      } catch (NumberFormatException exception) {
        System.out.println("Please Enter a valid Number");
      } catch (IOException exception) {
        System.out.println(exception);
      } catch (Exception e) {
        System.out.println(e);
      }
      
      } while (done == false);
    }
  
    public Date(){
      setDate();
      runTests();
    }
  }