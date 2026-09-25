import java.util.Arrays;

/**
 * Main and Konstruktor Class of CvsM
 * 
 * @author Jannis Kustos 
 * @version v0.2.1
 */

public class Main
{
    private static int[] GLOBAL_LIST_OF_DICE = {0,6,6,6};
    public static int GLOBAL_OFFSET = 0;
    
    public static void main(String[] args) {
        //testCalling Code
        CodeSim codeClass = new CodeSim();
        
        int[] x1 = codeClass.executeCode(GLOBAL_LIST_OF_DICE);
        System.out.println("EC RES: " + Arrays.toString(x1));
        
        MathSim mathClass = new MathSim();
        
        System.out.println("");
        
        int[] x2 = mathClass.executeMath(GLOBAL_LIST_OF_DICE);
        System.out.println("EM RES: " + Arrays.toString(x2));
        
        
        /*for(int i=0; i < 30; i++) {
            System.out.print( mathClass.f(i,8) + ", ");
        }*/
        
        System.out.println("START() FINISHED");
    }
}