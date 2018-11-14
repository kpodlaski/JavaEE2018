package dao.dao.basicimpl;

import dao.DAO;
import model.Person;
import model.Stanowisko;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 17.10.2018.
 */
public class RamDAO implements DAO {
    private List<Person> persons = new ArrayList<>();
    private List<Stanowisko> stanowiska = new ArrayList<>();

    public RamDAO(){
        Stanowisko st1 = new Stanowisko(1,"Kierownik");
        Stanowisko st2 = new Stanowisko(2,"Sekretarz");
        stanowiska.add(st1);
        stanowiska.add(st2);
        Person p = new Person("Adam","Adamczewski");
        p.setStanowisko(st2);
        p.setId(1);
        p.setFoto("img/orzel.jpg");
        persons.add(p);
        p = new Person("Ewelina","Ewelińska");
        p.setStanowisko(st1);
        p.setId(2);
        p.setFoto("img/sokol.jpg");
        persons.add(p);
    }

    @Override
    public List<Person> getAllPersons() {
        return persons;
    }

    @Override
    public List<Stanowisko> getAllStanowiska() {
        return stanowiska;
    }

    @Override
    public Person getPersonById(int id) {
        for (Person p : persons){
             if (p.getId() == id) return p;
        }
        return null;
    }

    @Override
    public Stanowisko getStanowiskoById(int id) {
        for (Stanowisko st : stanowiska){
            if (st.getId() == id) return st;
        }
        return null;
    }
}
