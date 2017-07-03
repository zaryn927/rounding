/**
 * 
 */
package edu.cnm.deepdive.rounder;

/**
 * @author Sky Link
 *
 */
public class Rounder {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(round(14, 4));
    System.out.println(round(-14, 4));
    System.out.println(round(100, -9));

  }
  
  public static long round(double number) {
    return Math.round(number);
  }
  
  public static int round(float number) {
    return Math.round(number);
  }
  
  public static double round(double value, double increment) {
    return 1.00;
  }
  
  public static int round(int value, int increment) {
    int sign = Math.round(Math.signum(value));
    value = Math.abs(value);
    increment = Math.abs(increment);
    int truncated = value / increment;
    int remainder = ((sign >= 0) ? value % increment : Math.floorMod(value, increment)) ;
    int rounded = truncated * increment;
    int adjustment = (2 * remainder >= increment) ? increment : 0;
    return sign * (rounded + adjustment);
  }

}
