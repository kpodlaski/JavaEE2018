package app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Author;
import model.Book;

import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 05.10.2018.
 */
public class Program {

    public static void main(String[] args) throws IOException {
        Author a = new Author();
        a.setName("Andrzej");
        a.setSurname("Sapkowski");
        Book b =  new Book("Krew Elfów");
        b.getAuthors().add(a);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(b);
        System.out.println(json);

        Book b2 = new Book("Java How to Program");
        a = new Author();
        a.setName("Paul");
        a.setSurname("Deitel");
        b2.getAuthors().add(a);
        a = new Author();
        a.setName("Harvey");
        a.setSurname("Deitel");
        b2.getAuthors().add(a);
        json = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(b2);
        System.out.println(json);

        Book b3 = mapper.readValue(json,Book.class);
        System.out.println(b3);
    }
}
