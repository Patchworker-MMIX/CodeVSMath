
/**
 * Beschreiben Sie hier die Klasse Code.
 * 
 * @author Jannis Kustos 
 * @version v0.2.0
 */

public class CodeSim extends Main
{
    public int[] executeCode(int[] X) {
        int numPossibleResults = 1;
        for(int i = 0; i < X.length; i++) {
            numPossibleResults *= X[i];
        }
        // Number of all possible results of the roll
        System.out.println("NPR: " + numPossibleResults);
        
        int maxPossibleResult = 0;
        for(int i = 0; i < X.length; i++) {
            maxPossibleResult += X[i];
        }
        // Maximum of all possible results of the roll
        System.out.println("MPR: " + maxPossibleResult);
        
        int[] resultArray = new int[maxPossibleResult+1];
        for(int i = 0; i <= maxPossibleResult; i++) {
            //System.out.println(i);
            resultArray[i] = 0;
        }
        System.out.println("len:" + resultArray.length);
        
        for(int i1 = 1; i1 <= numPossibleResults; i1++) {
            int tmpResult = 0;
            for(int i2 = 0; i2 < X.length; i2++) {
                /*
                System.out.println(
                    Math.floor((i1-1)/giveCorrectQ(i2,X))%X[i2]+1
                );
                */
                if(i2 == 0) {
                    tmpResult += ((Math.floor(i1-1))% X[i2])+1;
                }else {
                    tmpResult += ((Math.floor((i1-1)/X[i2-1]))% X[i2])+1;   
                }
            }
            System.out.println(tmpResult);
            resultArray[tmpResult]++;
        }

        return resultArray;
    }
}