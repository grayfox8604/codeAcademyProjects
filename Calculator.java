/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author bserrato
 */
public class Calculator{
//empty constructor
  public Calculator(){
    
  }
  // method to add
  public int add(int a, int b){
    int sum = a + b;
    return sum;
  }
  //method to subtract
  public int subtract(int a, int b){
    int subt = a - b;
    return subt;
  }
  //method to multiply
  public int multiply(int a, int b){
    int multi = a * b;
    return multi;
  }
  //method to divide
  public int divide(int a, int b){
    int divi = a / b;
    return divi;
  } 
  //method to return the remainder
  public int modulo(int a, int b){
    int modu = a % b;
    return modu;  
  }  
  //main class
  public static void main(String[]args){
    Calculator myCalculator = new Calculator ();
    
    System.out.println(myCalculator.add(5,7)); 
    System.out.println(myCalculator.subtract(45,11));
    
  }
}
