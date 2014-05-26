package strategy;

/**
 * Creado por santiago el 25/05/14.
 */
public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
