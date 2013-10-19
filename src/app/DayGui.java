/***********************************************************************
Program Name: DayGui.java
Programmer's Name: Brandt Lareau
Program Description: Try to have two buttons that we can click
***********************************************************************/
package app;


import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.*;
import javax.swing.JOptionPane; 

public class DayGui extends JFrame {
  private static final long serialVersionUID = 7712717603765541381L;
  private JFrame main_frame;
  private Container container;
  private JButton cmdGood; // Buttons from class ilab documents
  private JButton cmdBad; // Buttons from class ilab documents


  public static void main(String args[]){
    new DayGui();
  }
  
  public void buildButtons(){
    // Creating the buttons
    cmdGood = new JButton("Good");
    cmdBad  = new JButton("Bad");
      
    // add the button to the contentPane
    container.add(cmdGood);
    container.add(cmdBad);
      
  }

  public DayGui() {
    main_frame = new JFrame("Day Gui JFrame");
    
    container = main_frame.getContentPane();
    container.setLayout(new FlowLayout());

    buildButtons();
      
      
    cmdGood.setMnemonic('G'); // Single letters only alowed
    cmdBad.setMnemonic('B'); // Single letters only alowed

    main_frame.setSize(200,200);

    main_frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {System.exit(0);}
      });

      ButtonsHandler buttonHandler = new ButtonsHandler();
      cmdGood.addActionListener(buttonHandler);
      cmdBad.addActionListener(buttonHandler);
      main_frame.setVisible(true);
    }

    // Action Event Listener
    class ButtonsHandler implements ActionListener {
      public void actionPerformed(ActionEvent event) {
        if (event.getSource() == cmdGood)
          JOptionPane.showMessageDialog(null, "Today is a very good day!", "Event Handler Message", JOptionPane.INFORMATION_MESSAGE);
        else if (event.getSource() == cmdBad)
          JOptionPane.showMessageDialog(null, "I'm having a bad day today!", "Event Handler Message", JOptionPane.INFORMATION_MESSAGE);
      }
    }

  }

