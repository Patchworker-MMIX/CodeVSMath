import java.util.Arrays;

/**
 * Write a description of class SortDice here.
 *
 * @author Jannis Kustos
 * @version v0.1.0
 */
public class SortDice extends Main
{
    public int[] sortDice(int[] arrayToSort) {
        while(!(checkSortState(arrayToSort))) {
            
            for(int i = 1; i < arrayToSort.length - 1; i++) {
                if(arrayToSort[i] < arrayToSort[i+1]) {
                    int tmpArrayToSortSlot = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i+1];
                    arrayToSort[i+1] = tmpArrayToSortSlot;
                }
            }
            
        }
        
        return arrayToSort;
    }
    
    private boolean checkSortState(int[] arrayToAnalyse) {
        
        for(int i = 1; i < arrayToAnalyse.length - 1; i++) {
            if(arrayToAnalyse[i] < arrayToAnalyse[i+1]) { 
                //System.out.println(Arrays.toString(arrayToAnalyse) + "is not sorted");
                return false;
            }
        }
        //System.out.println(Arrays.toString(arrayToAnalyse) + "is sorted");
        return true;
    }
}