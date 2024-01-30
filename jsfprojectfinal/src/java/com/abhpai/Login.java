/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.abhpai;

/**
 *
 * @author abhpai
 */
public class Login {

    /**
     * Creates a new instance of Login
     */
    public Login() {
    }
    
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String checklogin(){
        if(name.equals("Abhay") && password.equals("abhay"))
            return "welcome";
        else
            return "failure";
    }
    
}
