package dao;

import model.Person;
import model.Stanowisko;

import java.util.List;

/**
 * Created by Krzysztof Podlaski on 17.10.2018.
 */
public interface DAO {
    List<Person> getAllPersons();
    List<Stanowisko> getAllStanowiska();
    Person getPersonById(int id);
    Stanowisko getStanowiskoById(int id);

}
