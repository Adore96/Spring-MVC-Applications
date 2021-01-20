package com.adore96.controller;

import com.adore96.bean.UserDataBean;
import com.adore96.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kalharaperera ON 1/4/21
 * @project MVC-CRUD
 */

@Controller
public class UserController {

    @Autowired
    UserDAO userDAO;

    @RequestMapping("signup")
    public String signup(UserDataBean userDataBean) {
        userDataBean.getName();
        userDataBean.getTelephone();
        userDAO.save(userDataBean);
        System.out.println("signup method called in UserController");

        return "indexx";
    }
//
//    @RequestMapping("/edit")
//    public void edit(){
//
//    }
//
//    @RequestMapping("/delete")
//    public void delete(){
//
//    }
//
//    @RequestMapping("/report")
//    public String report(){
//        return "display.jsp";
//    }
}
