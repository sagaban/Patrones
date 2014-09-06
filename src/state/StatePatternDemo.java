package state;

/**
 * Creado por santiago el 25/05/14.
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        /*
        En determinadas ocasiones, cuando el contexto en el que se está desarrollando requiere que un objeto
        tenga diferentes comportamientos según el estado en que se encuentra, resulta complicado poder manejar
        el cambio de comportamientos y los estados de dicho objeto, todos dentro del mismo bloque de código.
        El patrón State propone una solución a esta complicación, creando básicamente, un objeto por
        cada estado posible del objeto que lo llama.
        */

        Context context = new Context();    // Podría ser una "alarma" se comporta de forma diferente según
                                            // sus estados (activada, desactivada, en configuración, etc.)


        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
