package primedirective;
import java.util.ArrayList;
/**
 *
 * @author bserrato
 */
public class PrimeDirective {
    
    public PrimeDirective (){
        
    }
    
    public ArrayList<Integer> onlyPrimes(int [] b){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        
        for (int number: b){
            if (isPrime (number) == true){
              primes.add(number);
            }
        }
        
        return primes;
    }
    
    public boolean isPrime (int a){
    
    for (int i = 2; i<a; i++){
      if (a%i == 0){
        return false;
      }else
        return true;
        }
    
    if (a == 2){
      return true;
    }else
      return false;
    
  }

    public static void main(String[] args) {
        
       PrimeDirective pd = new PrimeDirective();
       int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
      
       System.out.println(pd.isPrime(2));
       System.out.println(pd.isPrime(3));
       System.out.println(pd.isPrime(4));
       System.out.println(pd.isPrime(8));
       System.out.println(pd.onlyPrimes(numbers));
      /* pd.isPrime(3);
       pd.isPrime(5);
       pd.isPrime(7);
       pd.isPrime(4);
       pd.isPrime(11);
       pd.isPrime(8);
       pd.isPrime(17);
       pd.isPrime(9);*/
       
    }
    
}
