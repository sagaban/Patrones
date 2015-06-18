package interceptin_filter;

/**
 * Creado por santiago el 27/05/14.
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
