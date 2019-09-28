
import java.util.*;


class TestClass {
    
    static void generatePrimes(int N){
        
        boolean primes[] = new boolean[N + 1];
        for(int i = 0; i < N; i++){
            primes[i] = true;
        }
        for(int j = 2; j * j <= N; j++){
            if(primes[j] == true){
                for(int i = j * j; i <= N; i += j){
                    primes[i] = false;
                }
            }
        }
        for(int i = 2; i <= N; i++){
            if(primes[i]){
                System.out.print(i + " ");
            }
        } 
    }
    
    public static void main(String args[] ) throws Exception {
       
       Scanner scan = new Scanner(System.in);
       
       int n = scan.nextInt();
       
       generatePrimes(n);

    }
}
