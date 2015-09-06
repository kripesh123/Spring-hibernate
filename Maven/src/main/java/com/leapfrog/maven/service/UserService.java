/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.maven.service;

import com.leapfrog.maven.dao.UserDAO;
import com.leapfrog.maven.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class UserService {
    
    @Autowired
    UserDAO udao;
    
    public int insert(User user){
        return udao.insert(user);
    }
    public int update(User user){
        return udao.update(user);
    }
    public int delete(int userId){
        return udao.delete(userId);
    }
    public List<User> getAll(){
        return udao.getAll();
    }
    public User getbyUserId(int userId){
        return udao.getByUserId(userId);
    }
    
}
