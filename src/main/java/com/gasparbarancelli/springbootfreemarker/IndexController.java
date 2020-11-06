package com.gasparbarancelli.springbootfreemarker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public ModelAndView get() {
        return new ModelAndView("index")
                .addObject("currentDate", LocalDate.now());
    }

}
