package com.adore96.dao;

import com.adore96.bean.UserDataBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author ON 1/19/21
 * @project MVC-CRUD
 */

public class UserDAO {
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserDataBean userDataBean;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(UserDataBean userDataBean){
        String sql="insert into user(name,username,password,role) values('"+userDataBean.getName()+"','"+userDataBean.getUsername()+"','"+userDataBean.getPassword()+"','"+userDataBean.getRole()+"')";
        return jdbcTemplate.update(sql);
    }
}
