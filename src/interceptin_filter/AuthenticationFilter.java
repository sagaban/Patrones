package interceptin_filter;

/**
 * Creado por santiago el 27/05/14.
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
