package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by student on 4/27/17.
 */
@Controller
public class WebController {
    @Autowired
    PersonRepository personRepository;
    @RequestMapping("/")
    public ModelAndView peopleList() { return new ModelAndView("home", "people", personRepository.findAll()); }
}
