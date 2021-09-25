package cg.wbd.grandemonstration.controller;

import cg.wbd.grandemonstration.model.Customer;
import cg.wbd.grandemonstration.service.CustomerService;
import cg.wbd.grandemonstration.service.impl.SimpleCustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("customers/list");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/customers/{id}")
    public ModelAndView showInformation(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("customers/info");
        Customer customer = customerService.findOne(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }
    //C1
//    @PostMapping
//    public String updateCustomer(Long id, String name, String email, String address) {
//        Customer customer = new Customer(id, name, email, address);
//        customerService.save(customer);
//        return"redirect:/customers";
//    }

    //C2
    @PostMapping
    public String updateCustomer(Customer customer) {
        customerService.save(customer);
        return "redirect:/customers";
    }

    //Tạo một config adapter với annotaion @Configuration để thay thế cho app-conf.xml:
    @Configuration
    @EnableWebMvc
    @ComponentScan("cg.wbd.grandemonstration")
    public class AppConfig extends WebMvcConfigurerAdapter {
        @Bean
        public ViewResolver viewResolver() {
            InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
            viewResolver.setPrefix("/WEB-INF/templates/");
            viewResolver.setSuffix(".jsp");
            return viewResolver;
        }

        @Bean
        public CustomerService customerService() {
            return new SimpleCustomerServiceImpl();
        }
    }

    //Thay the cho web.xml
    public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class[]{AppConfig.class};
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class[0];
        }

        @Override
        protected String[] getServletMappings() {
            return new String[]{"/"};
        }
    }
}
