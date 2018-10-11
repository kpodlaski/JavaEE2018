package model;

/**
 * Created by Krzysztof Podlaski on 05.10.2018.
 */
public class Author {
    private String name;
    private String surname;

    public Author(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + ' ' + surname;
    }
}
