package model;

/**
 * Created by Krzysztof Podlaski on 17.10.2018.
 */
public class Stanowisko {
    private int id;
    private String nazwa;

    public Stanowisko(int id, String nazwa) {
        this.id = id;
        this.nazwa = nazwa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
