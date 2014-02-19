import java.awt.Graphics;       // program uses class Graphics
import java.text.DecimalFormat;
import javax.swing.JApplet;     // program uses class JApplet
import javax.swing.JOptionPane; // program uses class JOptionPane

public class AdditionApplet extends JApplet 
{
    private double sum; // sum of values entered by user
    private double largest;
    private double smallest;
    private double median;
    private double range;
    private double product;
    private double average;
    private double quotient;
    private double number1; // first number to add
    private double number2; // second number to add
    private double number3; // third number to add
        
   // initialize applet by obtaining values from user
   public void init()
   {
       
      String firstNumber;  // first string entered by user
      String secondNumber; // second string entered by user
      String thirdNumber; // third string entered by user
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
      
  
// Calculates the numbers
      sum = number1 + number2 + number3; // add numbers
      product = number1 * number2 * number3; // add product
      average = (number1 + number2 + number3)/3; // average number
      range = (largestNumber() - smallestNumber()); // range
      quotient = largestNumber() / smallestNumber(); //quotient
   } // end method init
  
     
   //calculate largest number
  private double largestNumber (){
      return largest = Math.max(number1, Math.max(number2, number3));
  }
  // calculate smallest number
  private double smallestNumber (){
     return smallest = Math.min(number1, Math.min(number2, number3));
  }
  //calculate median number
  private double medianNumbers() {
    return median = sum-largest-smallest;
  }
  

   // draw results in a rectangle on applet’s background
   public void paint( Graphics g )
   {
      super.paint( g ); // call superclass version of method paint
      setSize(350, 225); //set size of Applet window
      g.drawRect( 15, 10, 325, 200 );//draws line box around wording
      
      String display = String.format("The numbers entered are %.2f, %.2f,%.2f",
                        number1,number2,number3);//displays message of numbers input
      DecimalFormat doubleDecimal = new DecimalFormat("0.00"); //format all numbers to have 2 digits

        // draw results as a String
       g.drawString(display, 25, 25);
       g.drawString("The sum is " + doubleDecimal.format(sum), 25, 45 );
       g.drawString("The product is "+doubleDecimal.format(product), 25, 65);
       g.drawString("The largest is "+doubleDecimal.format(largestNumber()), 25, 85);    
       g.drawString("The smallest is "+doubleDecimal.format(smallestNumber()), 25, 105);
       g.drawString("The average is "+doubleDecimal.format(average), 25, 125);
       g.drawString("The median is "+doubleDecimal.format(medianNumbers()), 25, 145);
       g.drawString("The range is "+doubleDecimal.format(range), 25, 165);
       g.drawString("The quotient of the largest divided"
               + " by the smallest is "+doubleDecimal.format(quotient)+".", 25, 185);
   } // /end method paint
} // end class AdditionApplet
