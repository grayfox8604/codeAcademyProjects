/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmagic;

/**
 *
 * @author bserrato
 */
public class MathMagic {
	public static void main(String[] args) {
	
            int myNumber = 5;
		//my number is the original number
            int stepOne = myNumber*myNumber;
            int stepTwo = stepOne + myNumber;
            int stepThree = stepTwo / myNumber;
            int stepFour = stepThree + 17;
            int stepFive = stepFour - myNumber;
            int stepSix = stepFive / 6;
            System.out.println(stepSix);
	}
}