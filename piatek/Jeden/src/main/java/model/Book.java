package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 05.10.2018.
 */
public class Book {
    @JsonProperty("tytul")
    private String title;
    @JsonProperty("autorzy")
    private List<Author> authors = new ArrayList<Author>();

    public Book(){}

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return authors + ", "+title;
    }
}
