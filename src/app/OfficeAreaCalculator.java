/***********************************************************************
Program Name: OfficeAreacalculator.java
Programmer's Name: Brandt Lareau
Program Description: calculate area of office
***********************************************************************/
package app;


import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.*;
import javax.swing.JOptionPane; 
import java.text.DecimalFormat;

public class OfficeAreaCalculator extends JFrame {
  private static final long serialVersionUID = 7722717603765541381L;
  private JFrame main_frame;
  private Container container;
  private JButton cmdExit; // QUIT
  private JButton cmdCalculate; // Calculate
  private JTextField lengthField;
  private JTextField widthField;
  private JTextField areaField;
  private JLabel lengthLabel;
  private JLabel widthLabel;
  private JLabel areaLabel;

  public static void main(String args[]){
    new OfficeAreaCalculator();
  }
  
  public void buildButtons(){
    // Creating the buttons
    cmdExit      = new JButton("Exit");
    cmdCalculate = new JButton("Calculate");
    
    cmdExit.setMnemonic('E'); // Single letters only alowed
    cmdCalculate.setMnemonic('C'); // Single letters only alowed
  }
  
  public void buildLabels(){
    lengthLabel = new JLabel("Enter the length of the office: ");
    widthLabel  = new JLabel("Enter the width of the office: ");
    areaLabel   = new JLabel("Office Area: ");
  }

  public void buildTextFields(){
    lengthField = new JTextField(5);
    widthField  = new JTextField(5);
    areaField   = new JTextField(5);

    areaField.setEditable(false);
  }
  
  public void addEverything(){
    container.add(lengthLabel);
    container.add(lengthField);
    
    container.add(widthLabel);
    container.add(widthField);
    
    container.add(areaLabel);
    container.add(areaField);
    
    // add the button to the contentPane
    container.add(cmdCalculate);
    container.add(cmdExit);
  }

  public OfficeAreaCalculator() {
    main_frame = new JFrame("Day Gui JFrame");
    
    container = main_frame.getContentPane();
    container.setLayout(new FlowLayout());

    buildButtons();
    buildLabels();
    buildTextFields();
    
    addEverything();
    
    main_frame.setSize(275,160);
    main_frame.setResizable( false );

    // define and register window event handler
    main_frame.addWindowListener( new WindowAdapter() 
    {
      public void windowClosing(WindowEvent e) 
      {
        System.exit(0);
      }
    }
    );

    //create and register an single button event handler
    ButtonsHandler buttonHandler = new ButtonsHandler();
    cmdExit.addActionListener(buttonHandler);
    cmdCalculate.addActionListener(buttonHandler); 
    main_frame.setVisible(true);
  }
  public void calculateArea()
  {
    DecimalFormat decimalFormat = new DecimalFormat("#.######");
    double width, length, area;
    try {
     length = Double.parseDouble(lengthField.getText());
     width = Double.parseDouble(widthField.getText());
     
     area = length * width;
     areaField.setText(decimalFormat.format(area));
     
    } catch (NumberFormatException exception) {
      areaField.setText("NaN");
    }
        
        
  }

  // Action Event Listener
  class ButtonsHandler implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      if (event.getSource() == cmdExit){
        System.exit(0);
      } else if(event.getSource() == cmdCalculate) {
        calculateArea();
      }
    }

  }
}