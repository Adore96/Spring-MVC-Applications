package com.adore96.controller;

import com.adore96.bean.UserDataBean;
import com.adore96.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Kasun_K ON 1/19/21
 * @project MVC-CRUD
 */

@Controller
public class CommonController {

    @Autowired
    UserDAO userDAO;

    @RequestMapping("/")
    public String userList(Model model) {
        System.out.println("UserList method Called.");
        List<UserDataBean> list = userDAO.studentList();
        model.addAttribute("list", list);
        return "indexx";
    }
}
