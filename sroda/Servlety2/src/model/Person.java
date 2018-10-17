package model;

/**
 * Created by Krzysztof Podlaski on 17.10.2018.
 */
public class Person {
    private int id;
    private String name;
    private String surname;
    private String foto; //path to photo
    private Stanowisko stanowisko;

    public Person(){
        this.name="AAA";
        this.surname="BBB";
        this.foto = "img/sokol.jsp";
    }

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

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }

    public String desc(){
        return name+"_"+surname;
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
