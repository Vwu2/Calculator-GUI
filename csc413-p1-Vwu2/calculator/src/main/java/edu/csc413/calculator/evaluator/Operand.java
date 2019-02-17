package java.edu.csc413.calculator.evaluator;
/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {

  int value;
  String token;


  public Operand( String token ) {
     //this.token = token;
     int number = Integer.parseInt(token);
     this.value = number;
  }
  /**
   * construct operand from integer
   */
  public Operand( int value ) {
      this.value = value;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int i){
      this.value = i;
  }

  public static boolean check( String token ) {
/*
      int temp;

      temp = Integer.parseInt(token);
      number;
*/
      int number;

      try{
        number = Integer.parseInt(token);
      } catch(NumberFormatException e){
          //catching error
          System.out.println("This isn't a number!");
          return false;
      }

      return true;
  }
}
