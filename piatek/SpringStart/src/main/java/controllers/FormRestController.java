package controllers;

import controllers.forms.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Krzysztof Podlaski on 20.12.2018.
 */
@RestController
public class FormRestController {

    @RequestMapping(path = "/t1.html",
    produces =  {"application/json"})
    public @ResponseBody Person formPost(){
        Person person = new Person();
        person.setName("Ala");
        person.setEmail("Ala@ala.com");
        return person;
    }
}
