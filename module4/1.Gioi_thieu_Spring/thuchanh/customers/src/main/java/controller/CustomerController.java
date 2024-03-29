package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerService;

@Controller
@RequestMapping(value = {"/customers", "/"})
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = {"/list", "/"}, method = RequestMethod.GET)
    public ModelAndView showList() {
        return new ModelAndView("list", "customerList", customerService.findAll());
    }

    @GetMapping(value = "/info/{id}")
    public String showInfo(@PathVariable("id") int customerId, ModelMap modelMap) {
        modelMap.addAttribute("customerInfo", customerService.findById(customerId));
        return "info";
    }
}
