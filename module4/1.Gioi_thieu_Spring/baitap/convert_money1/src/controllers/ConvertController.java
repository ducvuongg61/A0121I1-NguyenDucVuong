package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/result")
    public String call(@RequestParam("usd") int usd , Model model){
        int vnd = usd * 23000;
        model.addAttribute("vnd" , vnd);
        model.addAttribute("result" , usd + " USD = " + vnd + " VND");
        return "index";
    }
}
