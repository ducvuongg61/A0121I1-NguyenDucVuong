package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeController {
    @GetMapping("/worldClock")
    public String getTimeByTimezone(Model model, @RequestParam(name = "city", required = false, defaultValue = "Asia/Ho_Chi_Minh") String city) {
        //Get current time at local
        Date date = new Date();
        //Get timezone by the local
        TimeZone local = TimeZone.getDefault();
        //Get timezone by specified city
        TimeZone locale = TimeZone.getTimeZone(city);

        //Calculate the current time in the specified city
        long local_time = date.getTime() + (locale.getRawOffset() - local.getRawOffset());
        //Reset the date by localtime
        date.setTime(local_time);

        //Convert data for view
        //Set data sent to view
        model.addAttribute("city" , city);
        model.addAttribute("date" , date);
        return "index";
    }
}