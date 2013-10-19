/***********************************************************************
Program Name: Index.java
Programmer's Name: Brandt Lareau
Program Description: Text search index location, count total number of a characters
***********************************************************************/
package app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Index extends JFrame implements ActionListener {
  // JFrame Varables
  private JButton buttonOne         = new JButton("Find");
  private JTextField textFieldOne   = new JTextField(2);
  private JTextArea textArea        = new JTextArea(6, 30);
  private JLabel labelOne           = new JLabel();
  private JLabel labelTwo           = new JLabel();
  private JFrame frame              = new JFrame("Character Finder");
  private JScrollPane scrollPaneOne = new JScrollPane(textArea);
  private static final long serialVersionUID = 7712717603765541383L;
  

  // Varables
  private String string = "";
  // Init
  public static void main(String args[]) {
    new Index();
  }
  
  public void actionPerformed(ActionEvent e) {
    string = textArea.getText();
    String guess = textFieldOne.getText();
    Integer characterCount = 0;
    
    
    int index = string.indexOf(guess);
    int total = 0;
    while (index >= 0) {
      total++;
      index = string.indexOf(guess, index + 1);
    }
    JOptionPane.showMessageDialog(frame, "Number Of " + guess + "'s: " + total);

  }
  
  public void setLabels() {
    labelOne.setText("Enter a Character");
    labelTwo.setText("Enter Text to be searched");
  }
  
  public void setScrollPane(){
    scrollPaneOne.setHorizontalScrollBarPolicy(20);
  }
  
  public void addElements() {
    frame.add(labelTwo);
    frame.add(scrollPaneOne);
    frame.add(labelOne);
    frame.add(textFieldOne);
  }
  
  public Index() {
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLabels();
    addElements();
    frame.setBounds(300, 400, 400, 180);
    frame.setResizable(false);
    frame.setLayout(new FlowLayout());
    frame.setVisible(true);
    textFieldOne.addActionListener(this);
    
    
  }
}