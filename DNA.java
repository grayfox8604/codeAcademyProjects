/*
Write a DNA.java program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.
So for example:

ATGCGATACTGA is a protein because it has the start codon ATG, the stop codon TGA, and the length is divisible by by 3.
ATGCGATAGA is not a protein because the sequence length is not divisible by 3, so the third condition is not satisfied.
*/
package dna;

/**
 *
 * @author bserrato
 */
public class DNA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    
    String dna = dna3;
    
    if (((dna.length()%3) == 0)){
        int end = dna.indexOf("TGA");
        if(dna.substring(0, 3).equals("ATG") && (dna.substring(end).equals("TGA"))){ 
          System.out.println("Yer a Protein Harry!");  
        }else 
            System.out.println("No Protein for you!");
        
        }else {
        System.out.println("Not a Protein");
    }
    
    } 
}
