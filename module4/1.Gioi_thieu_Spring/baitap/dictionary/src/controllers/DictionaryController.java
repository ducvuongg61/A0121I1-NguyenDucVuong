package controllers;

import model.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.DictionaryServiceImpl;

import java.util.List;

@Controller
public class DictionaryController {
    DictionaryServiceImpl dictionaryService = new DictionaryServiceImpl();

    @GetMapping("/result")
    public String dictionary(@RequestParam String keyword, Model model) {
        List<Dictionary> dictionaries = dictionaryService.findAll();
        for (int i = 0; i < dictionaries.size(); i++) {
            if (keyword.equalsIgnoreCase(dictionaries.get(i).getEng())) {
                model.addAttribute("word", dictionaries.get(i).getVn());
                model.addAttribute("key", keyword);
                return "index";
            } else {
                model.addAttribute("word" ,"Not found!!" );
            }
        }
        return "index";
    }
}
