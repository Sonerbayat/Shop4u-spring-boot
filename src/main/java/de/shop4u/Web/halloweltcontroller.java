package de.shop4u.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class halloweltcontroller {

    @GetMapping(path = "/")
    public ModelAndView showhelloworldpage() {
        return new ModelAndView("hello world");
    }
}
