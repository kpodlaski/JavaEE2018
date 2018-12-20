package controllers.forms.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 20.12.2018.
 */
public class Contacts {
    private List<Person> persons = new ArrayList<Person>();

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
