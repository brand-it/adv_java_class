/***********************************************************************
Program Name: ShowEscapeSequences.java
Programmer's Name: Brandt Lareau
Program Description: System out print strings that have escape in them
***********************************************************************/
package app;

public class ShowEscapeSequences {
  
  // Init
  public static void main(String args[]) {
    new ShowEscapeSequences();
  }
  
  // Display the message
  public void say_message(){
    System.out.print(message());
  }
  
  // What is the message
  public String message(){
    return "I really like\nCIS355A\n        \"Business Application Programming with Lab using JAVA\"";
  }
  
  // New Event
  public ShowEscapeSequences(){
    say_message();
  }
}