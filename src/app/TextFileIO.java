/***********************************************************************
Program Name: TextFileIO.java
Programmer's Name: Brandt Lareau
Program Description: Guess a number game
***********************************************************************/
package app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TextFileIO {
  public static final int TOTAL = 100;
  private int[] integers_array = new int[TOTAL];
  private int total_even = 0;
  private String saveDir = "../saves/numbers.dat";
  
  public static void main(String args[]) {
    new TextFileIO();
  }
  
  public TextFileIO() {
    save();
    open();
  }

  
  public void open() {
    try {
      ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(saveDir));
      for (int y = 0; y < total_even; y++) {
        System.out.print(inputStream.readInt());
        if (y != (total_even - 1)) {
          System.out.print(", ");
        }
        
      }
      
    } catch (FileNotFoundException e) {
      System.out.println("Can't find your file");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public void save() {
    ObjectOutputStream outputStream;
    try {
      outputStream = new ObjectOutputStream(new FileOutputStream(saveDir));
      for (int y = 1; y <= TOTAL; y++) {
        if ( (y & 1) == 0 ) {
          total_even++;
          outputStream.writeInt(y); }
          
      }
      outputStream.close();
      System.out.println("File Saved");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}

