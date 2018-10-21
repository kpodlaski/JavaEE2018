package dao;

import model.Person;
import model.WorkPlacement;

import java.util.List;

/**
 * Created by Krzysztof Podlaski on 19.10.2018.
 */
public interface DAO {
    public List<Person> getAllPersons();
    public List<WorkPlacement> getAllWorkPlacements();
    public Person getPersonById(int id);
    public List<Person> getPersonsByName(String name);

}
