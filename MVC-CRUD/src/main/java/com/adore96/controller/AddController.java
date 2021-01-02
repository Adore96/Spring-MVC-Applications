package com.adore96.controller;

import com.adore96.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author kalharaperera ON 12/30/20
 * @project MVC-CRUD
 */

@Controller
public class AddController {

    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Add method called in AddController");

        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t2"));

        int k = new AddService().add(i, j);

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("display.jsp");
        modelAndView.addObject("result", k);

        return modelAndView;
    }
}
