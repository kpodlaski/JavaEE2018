package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Krzysztof Podlaski on 19.12.2018.
 */
@Controller
public class TestController {

    @RequestMapping("/test.html")
    private String test(Model m){
        m.addAttribute("title","Tytuł");
        m.addAttribute("page_text","Coś tam");
        return "Test";
    }

    @RequestMapping("/test2.html")
    private ModelAndView test2(){
        ModelAndView mv = new ModelAndView("Test");
        mv.addObject("title","Tytuł Strony Testowej");
        mv.addObject("page_text","Ala ma kota");
        return mv;
    }

}
