package additionapplet;

import java.awt.Graphics;       // program uses class Graphics
import javax.swing.JApplet;     // program uses class JApplet
import javax.swing.JOptionPane; // program uses class JOptionPane

public class AdditionApplet extends JApplet 
{
    private static Double sum; // sum of values entered by user
    private static Double largest;
    private static Double smallest;
    private static Double median;
    private static Double range;
    private static Double product;
    private static Double average;
    private static Double quotient;
    private static Double number1; // first number to add
    private static Double number2; // second number to add
    private static Double number3; // third number to add
    private static String firstNumber;  // first string entered by user
    private static String secondNumber; // second string entered by user
    private static String thirdNumber; // third string entered by user
    
   // initialize applet by obtaining values from user
   public void init()
   {

      // obtain first number from user
      firstNumber = JOptionPane.showInputDialog(
         "Enter first floating-point value" );

      // obtain second number from user
      secondNumber = JOptionPane.showInputDialog(
         "Enter second floating-point value" );

      // obtain third number from user
      thirdNumber = JOptionPane.showInputDialog(
         "Enter third floating-point value" );
      
      // convert numbers from type String to type double
      number1 = Double.parseDouble( firstNumber ); 
      number2 = Double.parseDouble( secondNumber );
      number3 = Double.parseDouble( thirdNumber );
      
  
     // sum = number1+number2+number3;
      //range = largest-smallest;
     // product = number1*number2*number3;
     // average = sum/3;
     // quotient = largest/smallest;
   } // end method init
  
     
   //calculate largest number
  private static void largestNumber (Double largest){
      largest = Math.max(number1, Math.max(number2, number3));
  }
  // calculate smallest number
  private static void smallestNumber (Double smallest){
      smallest = Math.min(number1, Math.min(number2, number3));
  }
  //calculate median number
  private static void medianNumbers(Double median) {
     median = sum-largest-smallest;
  }
  

   // draw results in a rectangle on applet’s background
   public void paint( Graphics g )
   {
      super.paint( g ); // call superclass version of method paint

      g.drawRect( 15, 10, 325, 200 );
      
      String display = String.format("%.2d, %.2d,%.2d",number1,number2,number3"
      // draw results as a String
       // g.drawString(display, 25, 25);
        g.drawString("The sum is " + sum, 25, 25 );
        g.drawString(display,25, 45);
        g.drawString("The smallest is "+smallest, 25, 65);
        g.drawString("The median is "+median, 25, 85);    
        g.drawString("The range is "+range, 25, 105);
        g.drawString("Product is "+product, 25, 145);
        g.drawString("Average is "+average, 25, 165);
        g.drawString("\nQuotient of the largest divided"
               + " by the smallest is "+quotient+".", 25, 185);
   } // end method paint
} // end class AdditionApplet