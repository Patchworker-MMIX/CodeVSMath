
/**
 * Beschreiben Sie hier die Klasse Code.
 * 
 * @author Jannis Kustos 
 * @version v0.2.2
 */

public class CodeSim extends Main
{
    public int[] executeCode(int[] X) {
        int numPossibleResults = 1;
        for(int i = 1; i < X.length; i++) {
            numPossibleResults *= X[i];
        }
        //Number of all possible results of the roll
        //System.out.println("NPR: " + numPossibleResults);
        
        int maxPossibleResult = 0;
        for(int i = 1; i < X.length; i++) {
            maxPossibleResult += X[i];
        }
        maxPossibleResult += GLOBAL_OFFSET;
        // Maximum of all possible results of the roll
        //System.out.println("MPR: " + maxPossibleResult);
        
        int[] resultArray = new int[maxPossibleResult+1];
        for(int i = 0; i <= maxPossibleResult; i++) {
            //System.out.println(i);
            resultArray[i] = 0;
        }
        //System.out.println("len:" + resultArray.length);
        
        for(int i1 = 1; i1 <= numPossibleResults; i1++) {
            int indexOfResult = GLOBAL_OFFSET;
            for(int i2 = 1; i2 < X.length; i2++) {
                int tmpIndexOfResult = 0;
                int tmpDividend = 1;
                for(int i3 = 1; i3 <= (i2-1); i3++) {
                    tmpDividend *= X[i3];
                }
                //System.out.println("tmpD: " + tmpDividend);
                    
                tmpIndexOfResult = (i1-1)/tmpDividend;
                tmpIndexOfResult = (int) Math.floor(tmpIndexOfResult);
                tmpIndexOfResult = tmpIndexOfResult % X[i2];
                tmpIndexOfResult++;
                
                indexOfResult += tmpIndexOfResult;
            }
            //System.out.println(indexOfResult);
            resultArray[indexOfResult]++;
        }

        return resultArray;
    }
}