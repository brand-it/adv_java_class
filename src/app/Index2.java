/***********************************************************************
Program Name: Index2.java
Programmer's Name: Brandt Lareau
Program Description: Count all the characters
***********************************************************************/
package app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Index2 extends JFrame implements ActionListener {
  // JFrame Varables
  private JButton buttonOne                  = new JButton("Counter Occurrences of Each Letter");
  private JTextField textFieldOne            = new JTextField(2);
  private JTextArea textAreaOne              = new JTextArea(6, 30);
  private JTextArea textAreaTwo              = new JTextArea(6, 30);
  private JLabel labelOne                    = new JLabel();
  private JLabel labelTwo                    = new JLabel();
  private JFrame frame                       = new JFrame("Character Counter");
  private JScrollPane scrollPaneOne          = new JScrollPane(textAreaOne);
  private JScrollPane scrollPaneTwo          = new JScrollPane(textAreaTwo);
  private static final long serialVersionUID = 7712717603765531381L;
  private String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", 
    "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
    "u", "v", "w", "x", "y", "z" }; // Faster to create a array then it is to build a program that does it for me.
  
  // Varables
  private String string = "";
  
  // Init
  public static void main(String args[]) {
    new Index2();
  }
  
  public void actionPerformed(ActionEvent e) {
    string = textAreaOne.getText();
    String guess = textFieldOne.getText();
    Integer characterCount = 0;
    String answer = "";
    int index;
    int total = 0;
    for (int i = 0; i < alphabet.length; i++){
      total = 0;
      index = string.indexOf(alphabet[i]);
      
      while (index >= 0) {
        total++;
        index = string.indexOf(alphabet[i], index + 1);
      }
      answer += alphabet[i] + " : " + total + "\n"; 
    }
    
    textAreaTwo.setText(answer);
  }
  
  public void setLabels() {
    labelOne.setText("Enter some text");
  }
  
  public void addElements() {
    frame.add(labelOne);
    frame.add(scrollPaneOne);
    frame.add(buttonOne);
    frame.add(scrollPaneTwo);
  }
  
  public Index2() {
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLabels();
    addElements();
    frame.setBounds(450, 300, 400, 300);
    frame.setResizable(false);
    frame.setLayout(new FlowLayout());
    frame.setVisible(true);
    buttonOne.addActionListener(this);
    
    
  }
}