import java.util.Arrays;

/**
 * Main and Konstruktor Class of CvsM
 * 
 * @author Jannis Kustos 
 * @version v0.2.1
 */

public class Main
{
    private static int[] GLOBAL_LIST_OF_DICE = {0,2,4,6};
    public static int GLOBAL_OFFSET = 0;
    
    public static void main(String[] args) {
        CodeSim CodeClassi = new CodeSim();
        MathSim MathClassi = new MathSim();
        SortDice SortDiceClassi = new SortDice();
        //declare objects
        
        int[] codeSimulatedResults = CodeClassi.executeCode(GLOBAL_LIST_OF_DICE);
        System.out.println("EC RES: " + Arrays.toString(codeSimulatedResults));
        
        System.out.println("");
        
        int[] mathSimulatedResults = MathClassi.executeMath(SortDiceClassi.sortDice(GLOBAL_LIST_OF_DICE));
        System.out.println("EM RES: " + Arrays.toString(mathSimulatedResults));
        
        
        /*for(int i=0; i < 30; i++) {
            System.out.print( mathClass.f(i,8) + ", ");
        }*/
        
        //System.out.println(Arrays.toString(SortDiceClassi.sortDice(GLOBAL_LIST_OF_DICE)));
        
        System.out.println("START() FINISHED");
    }
}