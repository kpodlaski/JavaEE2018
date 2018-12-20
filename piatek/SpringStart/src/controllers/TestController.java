package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Krzysztof Podlaski on 14.12.2018.
 */
@Controller
public class TestController {

    @RequestMapping("test/{id},{userName}")
    public ModelAndView test(@PathVariable String userName,
                             @PathVariable int id){
        ModelAndView mv = new ModelAndView("Test");
        mv.addObject("title","Strona Testowa");
        mv.addObject("name",id+userName);
        return mv;
    }

    @RequestMapping("test2/{id},{userName}")
    public String test2(@PathVariable(name = "userName")
                                    String name,
                        @PathVariable int id,
                        Model m){
        m.addAttribute("title","Strona T2");
        m.addAttribute("name",id+name);
        return "Test";
    }
}
