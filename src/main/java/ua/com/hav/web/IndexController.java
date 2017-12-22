package ua.com.hav.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping("/time")
    public String time(Model model) {
        model.addAttribute("time", new Date());
        return "time";
    }
}
