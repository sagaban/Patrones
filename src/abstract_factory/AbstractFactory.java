package abstract_factory;

/**
 * Creado por santiago el 28/04/14.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}

