import java.util.Arrays;

/**
 * Beschreiben Sie hier die Klasse main.
 * 
 * @author Jannis Kustos 
 * @version v0.0.1
 */

public class main
{
    private int[] GLOBAL_LIST_OF_DICE = {0,1,2};
    private int GLOBAL_OFFSET = 0;
    
    public void start() {
        //testCalling Code
        Code codeClass = new Code();
    
        int[] x = codeClass.executeCode(GLOBAL_LIST_OF_DICE);
        System.out.println("EC RES: " + Arrays.toString(x));
        System.out.println("START() FINISHED");
        
    }
}