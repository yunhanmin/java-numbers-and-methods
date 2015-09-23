/*
 * Project: PassFail.java
 * Description: Returns true/false if you pased/failed a class/test
 * Name: Hanmin Yun
 * Date: Sept 23, 2015
 */

import java.util.Scanner;

public class PassFail {
  
  public static void main( String[] args ){
    
    Scanner s = new Scanner( System. in );
    int score; // user score
    
    System.out.println( "Enter your PSAT score: " ); // promt
    score = s.nextInt();
    
    System.out.println( "Passed: " + checkPassed( score ) ); // method
    
  } // end main method
  
  public static boolean checkPassed( int psatScore ) {
    
    if ( psatScore > 0 && psatScore <= 1520 ) {
      if ( psatScore < 320 ) {
        return false;
      } else {
        return true;
      }
    } else {
      return false;
    }
    
  }// end checkPassed method
  
} // end class
