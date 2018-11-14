package model;

/**
 * Created by Krzysztof Podlaski on 19.10.2018.
 */
public class WorkPlacement {
    private int id;
    private String name;

    public WorkPlacement(String name) {
        this.name = name;
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
}
