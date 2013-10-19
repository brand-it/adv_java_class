/***********************************************************************
Program Name: GuessGame.java
Programmer's Name: Brandt Lareau
Program Description: Guess a number game
***********************************************************************/
package app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GuessGame extends JFrame implements ActionListener {
  private int max = 1000;
  private int min = 1;
  private int random_number = 0;
  private JButton button;
  private JTextField entry;
  private JLabel question;
  private JLabel entry_label;
  private JLabel status;
  private static final long serialVersionUID = 7712713603765541381L;
  
  
  // Init
  public static void main(String args[]) {
    new GuessGame();
  }
  
  public void generateNumber(){
    random_number = (int) (Math.random() * ( max - min ));
  }


  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == button) {
      int value = Integer.parseInt(entry.getText());
      if (value == random_number) {
        status.setText("You guess right lets play again");
      } else {
        status.setText("Sorry wrong anwer");
      }
      generateNumber();
    }
  }  
  
  
  public GuessGame() {
    button = new JButton("Guess");//The JButton name.
    button.addActionListener(this);
    entry_label = new JLabel();
    question = new JLabel();
    status = new JLabel();
    status.setText("Type a number to find out if you go the right anwer");
    
    
    question.setText("I have a number between 1 and 1000 -- can you guess my number?");
    entry_label.setText("Enter A Number: ");
    
    entry = new JTextField( 10);
    
    //1. Create the frame.
    JFrame frame = new JFrame("FrameDemo");
    frame.setSize(350, 100);
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(entry_label);
    frame.add(entry);
    frame.add(button);
    frame.add(status);

    
    frame.setVisible(true);

    
    generateNumber();
    
  }

}