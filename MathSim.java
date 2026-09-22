
/**
 * Beschreiben Sie hier die Klasse Math.
 * 
 * @author Jannis Kustos 
 * @version v0.1.0
 */

public class MathSim extends Main
{
    public int[] executeMath(int[] X) {
        int n = X.length;
        
        int maxPossibleResult = 0;
        for(int i = 1; i < X.length; i++) {
            maxPossibleResult += X[i];
        }
        
        
        int[] result = new int[maxPossibleResult+1];
        
        for(int i = 1; i <= maxPossibleResult; i++) {
            result[i] = g(i,n,X);
        }
        
        return result;
    }
    
    private int g(int w, int n, int[] X) {
        int result = 0;
        double maxWeight = 0;
        for(int i = 1; i < n; i++) {
            maxWeight += X[i];
        }
        maxWeight = maxWeight-n;
        maxWeight /= 2;
        maxWeight++;
        //Calculates the maximum
        System.out.println("Wmax: " + maxWeight);
        
        n--;
        if(n == 1) {
            return 1;
        }else {
            for(int i = Math.max( ( f(w,maxWeight) - (X[n] - 1) ), 1); i <= f(w,maxWeight); i++) {
                result += g(w,n,X); 
            }
        }
        
        return result;
    }
    
    private int f(int a, double b) {
        double fixedValue = (a-1)/(2*(b-1));
        fixedValue = fixedValue - Math.floor(fixedValue + 0.5);
        fixedValue = Math.abs(fixedValue)*2*(b-1)+1;
        
        int result = (int) fixedValue;
        return result;
    }
}