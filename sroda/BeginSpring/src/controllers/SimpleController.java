package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * Created by Krzysztof Podlaski on 19.12.2018.
 */
@Controller
public class SimpleController {

    @RequestMapping(path="/simple/{v2}/{name}",
                    method= RequestMethod.GET)
    private String simple2(Model m,
                           @PathVariable String name,
                           @PathVariable Date v2) {
        return "aaaa";
    }

    @RequestMapping("/simple/{v}/{name},{surname}")
    private String simple1(Model m,
                           @PathVariable String name,
                           @PathVariable(name = "surname")
                                       String sname,
                           @PathVariable int v){
        m.addAttribute("name",name);
        m.addAttribute("sname",sname);
        switch (v) {
            case 2:
                return "Simple_page2";
            default:
                return "Simple_page";
        }
    }
}
