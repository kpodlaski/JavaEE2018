package controllers;

import controllers.forms.model.Contacts;
import controllers.forms.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Krzysztof Podlaski on 20.12.2018.
 */
@Controller
public class FormController {

    @Autowired
    Contacts contacts;

    @RequestMapping(path = "/form.html",
            method= RequestMethod.GET)
    public String formGet(){
        return "form";
    }

    @RequestMapping(path = "/form2.html",
            method= RequestMethod.POST)
    public String form2Post(Model model,
                           String name,
                           String email
    ){
        model.addAttribute("name",name);
        model.addAttribute("email",email);
        return "form_reply";
    }

    @RequestMapping(path = "/form.html",
            method= RequestMethod.POST)
    public String formPost(Model model,
           Person person
    ){
        model.addAttribute("person",person);
        contacts.getPersons().add(person);
        return "form_reply";
    }

    @RequestMapping("contacts.html")
    public String contacts(Model m){
        m.addAttribute("persons",contacts.getPersons());
        return "contacts";
    }


    @RequestMapping(path = "/form3.html",
            method= RequestMethod.POST,
            produces = "applicaton/json")
    public Person form3Post(Model model,
                           Person person
    ){
        return person;
    }


}
