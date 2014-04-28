package abstract_factory;

/**
 * Creado por santiago el 28/04/14.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}