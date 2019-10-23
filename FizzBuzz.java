/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * Write a short program that prints each number from 1 to 100 on a new line. 
 * For each multiple of 3, print "Fizz" instead of the number. 
 * For each multiple of 5, print "Buzz" instead of the number. 
 * For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
 * @author bserrato
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        for (int i=0 ;i <= 100 ;i++){
            if(i%3 == 0 && i%5 == 0){
               System.out.println("FizzBuzz");
            }else if(i%3 == 0){
                System.out.println("Fizz");
            }else if (i%5 == 0){
                System.out.println("Buzz");
            }else 
            System.out.print(i + "\n");
    }
    }
}
