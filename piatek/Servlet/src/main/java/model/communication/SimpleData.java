package model.communication;

/**
 * Created by Krzysztof Podlaski on 26.10.2018.
 */
public class SimpleData {
    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value.replace(" ","_");
    }
}
