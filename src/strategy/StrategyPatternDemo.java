package strategy;

/**
 * Creado por santiago el 25/05/14.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        // Patrón muy similar a State, donde en vez de definir un estado, defino una estrategia


        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
