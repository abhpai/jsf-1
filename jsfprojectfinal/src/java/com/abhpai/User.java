/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.abhpai;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author abhpai
 */
@Named(value = "user")
@RequestScoped
public class User {

    /**
     * Creates a new instance of User
     */
    
    private String name;
    private String pass;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    
    public User() {
    }
    
    public String displaycommand(){
        return "test";
    }
    
}
