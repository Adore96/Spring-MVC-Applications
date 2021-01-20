package com.adore96.controller;

import com.adore96.bean.UserDataBean;
import com.adore96.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

/**
 * @author Kasun_K ON 1/4/21
 * @project MVC-CRUD
 */

@Controller
public class UserController {

    @Autowired
    UserDAO userDAO;

//    @RequestMapping("login")
//    public RedirectView login(UserDataBean userDataBean) {
//        System.out.println("[INFO] Signup method in UserController");
//        if (userDAO.save(userDataBean)==1){
//            System.out.println("[INFO] Data was inserted successfully.");
//        }else {
//            System.out.println("[INFO] Data was not inserted");
//        }
//        return new RedirectView("/MVC_CRUD_war_exploded/");
//    }

    @RequestMapping("signup")
    public RedirectView signup(UserDataBean userDataBean) {
        System.out.println("[INFO] Signup method in UserController");
        if (userDAO.save(userDataBean)==1){
            System.out.println("[INFO] Data was inserted successfully.");
        }else {
            System.out.println("[INFO] Data was not inserted");
        }
        return new RedirectView("/MVC_CRUD_war_exploded/");
    }

    @RequestMapping(value="/editemp/{id}")
    public String edit(@PathVariable int id, Model m){
        Emp emp=dao.getEmpById(id);
        m.addAttribute("command",emp);
        return "empeditform";
    }

    /* It deletes record for the given id in URL and redirects to /viewemp */
    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable int id){
        dao.delete(id);
        return "redirect:/viewemp";
    }





}
