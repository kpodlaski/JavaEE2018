package model;

/**
 * Created by Krzysztof Podlaski on 14.11.2018.
 */
public class Stanowisko {
    private int id;
    private String nazwa;

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

    public String toString(){
        return nazwa;
    }
}
