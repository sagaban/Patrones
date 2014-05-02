package filter_criteria;

import java.util.List;

/**
 * Creado por santiago el 02/05/14.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}

