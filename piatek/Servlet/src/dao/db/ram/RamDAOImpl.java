package dao.db.ram;

import dao.DAO;
import model.Person;
import model.WorkPlacement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 19.10.2018.
 */
public class RamDAOImpl implements DAO {

    List<Person> persons = new ArrayList<>();
    List<WorkPlacement> placements = new ArrayList<>();

    public RamDAOImpl(){
        Person p = new Person("Tomasz", "Tomaszewski");
        p.setId(1);
        p.setPhoto("images/cat1.jpg");
        p.setPlacement(new WorkPlacement("Secretary"));
        persons.add(p);
        p = new Person("Alicja", "Alicka");
        p.setId(2);
        p.setPhoto("images/cat2.jpg");
        p.setPlacement(new WorkPlacement("Manager"));
        persons.add(p);

    }

    @Override
    public List<Person> getAllPersons() {
        return persons;
    }

    @Override
    public List<WorkPlacement> getAllWorkPlacements() {
        return placements;
    }

    @Override
    public Person getPersonById(int id) {
        for (Person p : persons){
            if (p.getId()==id) return p;
        }
        return null;
    }

    @Override
    public List<Person> getPersonsByName(String name) {
        throw new RuntimeException("NOT IMPLEMENTED YET!!!");
    }
}
