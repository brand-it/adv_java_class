/***********************************************************************
Program Name: ThreeArrayList.java
Programmer's Name: Brandt Lareau
Program Description: Calculate some numbers using arrays
***********************************************************************/
package app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;


public class ThreeArrayLists {
  private int length = 10;
  private double[] priceList     = { 4.0, 8.5, 6.0, 7.35, 9.0, 15.3, 3.0, 5.4, 2.9, 4.8 };;
  private double[] quantityList  = { 10.62, 14.89, 13.21, 16.55, 18.62, 9.47, 6.58, 18.32, 12.15, 3.98 };
  private double[] amountList    = new double[length];
  DecimalFormat decimal_format = new DecimalFormat("#.##");
  

  // Init
  public static void main(String args[]) {
    new ThreeArrayLists();
  }
  
  public void calculateTotals() {
    int count = 0;
    while ( count < length ) {
      amountList[count] = priceList[count] * quantityList[count];
      count++;
    }
  }
  
  public void displayList() {
    int count = 0;
    while ( count < length ) {
      System.out.println( (count + 1) + ") " + quantityList[count] + " * " + priceList[count] + " = " + decimal_format.format( amountList[count] ));
      count++;
    }
  }
  
  public ThreeArrayLists() {
    calculateTotals();
    displayList();
  }
  
}