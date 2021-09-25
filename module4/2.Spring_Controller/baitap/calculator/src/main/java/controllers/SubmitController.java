package controllers;

import model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubmitController {
    @GetMapping("/calculator")
    public String result() {
        return "index";
    }

    @PostMapping("/result")
    public String showForm(Model model, @RequestParam double firstNum, @RequestParam double secondNum,
                           @RequestParam String operator) {
        Calculator calculator = new Calculator(firstNum, secondNum, operator);
        double result = calculator.result();
        model.addAttribute("result", result);
        return "index";
    }


}
