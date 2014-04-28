package abstract_factory;

/**
 * Creado por santiago el 28/04/14.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}