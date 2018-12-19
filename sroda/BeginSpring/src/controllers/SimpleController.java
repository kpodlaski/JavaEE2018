package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Krzysztof Podlaski on 19.12.2018.
 */
@Controller
public class SimpleController {

    @RequestMapping("/simple/{name}/{surname}")
    private String simple1(Model m,
                           @PathVariable String name,
                           @PathVariable(name = "surname")
                                       String sname){
        m.addAttribute("name",name);
        m.addAttribute("sname",sname);
        return "Simple_page";
    }
}
