package interceptin_filter;

/**
 * Creado por santiago el 27/05/14.
 */
public class DebugFilter implements Filter{
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
