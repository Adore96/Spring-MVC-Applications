package com.adore96.dao;

import com.adore96.bean.UserDataBean;
import org.springframework.jdbc.core.JdbcTemplate;

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
//    public int delete(int id){
//        String sql="delete from Emp99 where id="+id+"";
//        return template.update(sql);
//    }
//    public Emp getEmpById(int id){
//        String sql="select * from Emp99 where id=?";
//        return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));
//    }
//    public List<Emp> getEmployees(){
//        return template.query("select * from Emp99",new RowMapper<Emp>(){
//            public Emp mapRow(ResultSet rs, int row) throws SQLException {
//                Emp e=new Emp();
//                e.setId(rs.getInt(1));
//                e.setName(rs.getString(2));
//                e.setSalary(rs.getFloat(3));
//                e.setDesignation(rs.getString(4));
//                return e;
//            }
//        });
//    }
}
