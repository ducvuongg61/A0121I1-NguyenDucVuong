package com.product.controllers;

import com.product.model.Product;
import com.product.service.ProductService;
import com.product.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {
    ProductService productService = new ProductServiceImpl();

    @GetMapping("/")
    public String index(Model model) {
        List<Product> productList = productService.findAllProduct();
        model.addAttribute("products", productList);
        return "/index";
    }

    @GetMapping("/product/create")
    public String createForm(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/product/save")
    public String create(Product product) {
        product.setId((int) (Math.random() * 1000));
        productService.save(product);
        return "redirect:/";
    }

    @GetMapping("/product/{id}/edit")
    public String editForm(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/edit";
    }

    @PostMapping("/product/update")
    public String update(Product product) {
        productService.update(product.getId(), product);
        return "redirect:/";
    }

    @GetMapping("/product/{id}/delete")
    public String delete(@PathVariable int id, Model model, RedirectAttributes attributes, Product product) {
        model.addAttribute("product", productService.findById(id));
        productService.delete(product.getId());
        attributes.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/view")
    public String viewForm(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/view";
    }
}
