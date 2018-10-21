package model;

/**
 * Created by Krzysztof Podlaski on 19.10.2018.
 */
public class Person {
    private int id;
    private String name;
    private String surname;
    private String photo;
    private WorkPlacement placement;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public WorkPlacement getPlacement() {
        return placement;
    }

    public void setPlacement(WorkPlacement placement) {
        this.placement = placement;
    }
}
