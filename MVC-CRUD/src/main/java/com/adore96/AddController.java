package com.adore96;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author kalharaperera ON 12/30/20
 * @project MVC-CRUD
 */

@Controller
public class AddController {

    @RequestMapping("/add")
    public String add(HttpServletRequest request, HttpServletResponse response) {
        
        System.out.println("Hello Print");
        return "display.jsp";
    }
}
