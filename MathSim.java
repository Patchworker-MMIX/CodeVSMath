import java.util.Arrays;
/**
 * Beschreiben Sie hier die Klasse Math.
 * 
 * @author Jannis Kustos 
 * @version v0.2.0
 */

public class MathSim extends Main
{
    public int[] executeMath(int[] X) {
        int n = X.length - 1;
        
        
        int maxPossibleResult = 0;
        for(int i = 1; i < X.length; i++) {
            maxPossibleResult += X[i];
        };
        
        int[] result = new int[maxPossibleResult+1];
        
        for(int i = 1; i <= maxPossibleResult-(n-1); i++) {
            result[i+(n-1)] = g(i,n,X);
        }
        
        return result;
    }
    
    private int g(int w, int n, int[] X) {
        //System.out.println("W: " + w + "; n: " + n + "; X" + Arrays.toString(X));
        if(n == 1) {
            return n;
        }
        
        double max = 0.5;
        for(int i = 1; i <= n; i++) {
            max += X[i];
        }
        //Calculates the maximum
        //System.out.println("max: " + max);
        //System.out.println("n: " + n);
        //System.out.println("maxWeight: " + (((max-n)/2)+1));
        
        int wModed = (int) Math.floor( f(w, (((max-n)/2)+1) ));
        //rounding to avoid EVERYTHING beeing double
        
        int res = 0;
        
        for(int k = Math.max( ( wModed - (X[n] - 1) ), 1); k <= wModed; k++) {
            res += g(k,(n-1),X);
        }
        //System.out.println("");
        //System.out.println("Finall RES: " + res);
        //System.out.println("");
        return res;
    }
    
    private double f(int a, double b) {
        double fixedValue = (a-1)/(2*(b-1));
        fixedValue = fixedValue - Math.floor(fixedValue + 0.5);
        fixedValue = Math.abs(fixedValue)*2*(b-1)+1;
        
        return fixedValue;
    }
}