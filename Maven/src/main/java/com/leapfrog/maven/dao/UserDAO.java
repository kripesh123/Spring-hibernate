/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.maven.dao;

import com.leapfrog.maven.entity.User;

/**
 *
 * @author Admin
 */
public interface UserDAO extends GenericDAO<User>{
    
    int delete(int userId);
    User getByUserId(int userId);
}
