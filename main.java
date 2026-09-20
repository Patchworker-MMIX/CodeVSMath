import java.util.Arrays;

/**
 * Main and Konstruktor Class of CvsM
 * 
 * @author Jannis Kustos 
 * @version v0.2.0
 */

public class Main
{
    private static int[] GLOBAL_LIST_OF_DICE = {2,4,6};
    public static int GLOBAL_OFFSET = 10;
    
    public static void main(String[] args) {
        //testCalling Code
        CodeSim codeClass = new CodeSim();
        
        int[] x = codeClass.executeCode(GLOBAL_LIST_OF_DICE);
        System.out.println("EC RES: " + Arrays.toString(x));
        System.out.println("START() FINISHED");
        
    }
}