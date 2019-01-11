package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Krzysztof Podlaski on 12.12.2018.
 */
@Controller
public class TestController {

    @RequestMapping("test.html")
    public String test(){
        return "Test";
    }
}
