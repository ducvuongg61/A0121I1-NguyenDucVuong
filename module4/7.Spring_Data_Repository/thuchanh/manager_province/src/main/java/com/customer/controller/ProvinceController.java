package com.customer.controller;

import com.customer.model.Province;
import com.customer.service.CustomerService;
import com.customer.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/province")
    public ModelAndView showList(){
        Iterable<Province> provinces = provinceService.findAll();
        ModelAndView modelAndView = new ModelAndView("/province/list");
        modelAndView.addObject("provinces" , provinces);
        return modelAndView;
    }

    @GetMapping("/create-province")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("province/create");
        modelAndView.addObject("province",  new Province());
        return modelAndView;
    }

    @PostMapping("/create-province")
    public ModelAndView createProvince(@ModelAttribute("province") Province province){
        provinceService.save(province);
        ModelAndView modelAndView = new ModelAndView("province/create");
        modelAndView.addObject("message" , "Created");
        modelAndView.addObject("province" , new Province());
        return modelAndView;
    }

    @GetMapping("/edit-province/{id}")
    public ModelAndView showEdit(@PathVariable Long id){
        Province province = provinceService.findById(id);
        if(province != null){
            ModelAndView modelAndView = new ModelAndView("/province/edit");
            modelAndView.addObject("province" , province);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-province")
    public ModelAndView editProvince(@ModelAttribute("province") Province province){
        provinceService.save(province);
        ModelAndView modelAndView = new ModelAndView("/province/edit");
        modelAndView.addObject("message" , "Updated!");
        modelAndView.addObject("province" , province);
        return modelAndView;
    }

    @GetMapping("/delete-province/{id}")
    public ModelAndView showDelete(@PathVariable Long id){
        Province province = provinceService.findById(id);
        if(province != null){
            ModelAndView modelAndView = new ModelAndView("/province/delete");
            modelAndView.addObject("province" , province);
            return modelAndView;
        }
        else {
            ModelAndView modelAndView = new ModelAndView("error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-province")
    public String deleteProvince(@ModelAttribute("province") Province province){
        provinceService.delete(province.getProvince_id());
        return "redirect:/province";
    }
}
