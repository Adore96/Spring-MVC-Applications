package com.adore96.controller;

import com.adore96.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ON 1/19/21
 * @project MVC-CRUD
 */

@Controller
public class CommonController {

    @RequestMapping("/")
    public String index() {
        System.out.println("Add method called in AddController");

        return "login";
    }
}
