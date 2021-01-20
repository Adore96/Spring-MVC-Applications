package com.adore96.dao;

import com.adore96.bean.UserDataBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author ON 1/19/21
 * @project MVC-CRUD
 */

public class UserDAO {
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(UserDataBean userDataBean) {
        String sql = "insert into user(name,username,password,telephone,roleid) values('" + userDataBean.getName() + "','" + userDataBean.getUsername() + "','" + userDataBean.getPassword() + "','" + userDataBean.getTelephone() + "','" + userDataBean.getRoleid() + "')";
        return jdbcTemplate.update(sql);
    }

//    public int update(Emp p){
//        String sql="update Emp99 set name='"+p.getName()+"', salary="+p.getSalary()+",designation='"+p.getDesignation()+"' where id="+p.getId()+"";
//        return template.update(sql);
//    }
    public int delete(int id){
        String sql="delete from Emp99 where id="+id+"";
        return template.update(sql);
    }
//    public Emp getEmpById(int id){
//        String sql="select * from Emp99 where id=?";
//        return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));
//    }

    public List<UserDataBean> studentList() {
        return jdbcTemplate.query("select * from user", new RowMapper<UserDataBean>() {
            public UserDataBean mapRow(ResultSet resultSet, int row) throws SQLException {
                UserDataBean userDataBean = new UserDataBean();

                userDataBean.setId(resultSet.getInt(1));
                userDataBean.setName(resultSet.getString(2));
                userDataBean.setUsername(resultSet.getString(3));
                userDataBean.setTelephone(resultSet.getInt(5));
                userDataBean.setRoleid(resultSet.getInt(6));
                return userDataBean;
            }
        });
    }
}
