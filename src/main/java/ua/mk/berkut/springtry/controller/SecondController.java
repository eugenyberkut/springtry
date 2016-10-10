package ua.mk.berkut.springtry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Eugeny on 10.10.2016.
 */
@Controller
@RequestMapping(value = "/category/{categoryName}")
public class SecondController {

    @RequestMapping(value = "/product/{productName}")
    public ModelAndView showProduct(@PathVariable String productName, @PathVariable String categoryName) {
        return new ModelAndView("product")
                .addObject("category", categoryName)
                .addObject("product", productName);
    }
}
