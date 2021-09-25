package controllers;

import model.Sandwich;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
;

@Controller
public class CondimentController {
    @GetMapping("/showForm")
    public String showForm(Model model){
        Sandwich sandwich = new Sandwich();
        model.addAttribute("sandwich" , sandwich);
        return "index";
    }

    @RequestMapping("/result")
    public String result(@ModelAttribute("sandwich") Sandwich sandwich){
        return "submit";
    }
}
