package singleton;

/**
 * Creado por santiago el 28/04/14.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        System.out.println("Empieza la ejecución del programa");
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}
