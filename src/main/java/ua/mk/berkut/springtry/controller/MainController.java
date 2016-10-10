package ua.mk.berkut.springtry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by Eugeny on 10.10.2016.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/")
    public String main(){
        return "index";
    }

    @RequestMapping(value = "login")
    public ModelAndView login(@RequestParam String user, @RequestParam int age, @RequestParam String pass) {
        return new ModelAndView("login")
                .addObject("user",user)
                .addObject("age",age)
                .addObject("pass",pass);
    }

    @RequestMapping(value = "dir/{year}/{month}/{day}")
    public ModelAndView dir(@PathVariable int year, @PathVariable int month, @PathVariable int day) {
        String t = LocalDate.of(year, month, day).format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        return new ModelAndView("dir").addObject("str", "date = " + t);
    }
}
