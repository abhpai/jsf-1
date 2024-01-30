/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.abhpai;

import java.util.*;


/**
 *
 * @author abhpai
 */
public class Test {

    /**
     * Creates a new instance of Test
     * 
     */
    
    private String selectbox;
    
    private Map<String,String> items;
    
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    

    public Map<String, String> getItems() {
        return items;
    }

    public void setItems(Map<String, String> items) {
        this.items = items;
    }

    public Test(String selectbox) {
        this.selectbox = selectbox;
    }

    public String getSelectbox() {
        return selectbox;
    }

    public void setSelectbox(String selectbox) {
        this.selectbox = selectbox;
    }
    
    public Test() {
        items=new HashMap<>();
        items.put("C","Programming in C");
        items.put("Java", "Programming in Java");
        items.put("Programming in C++", "C++");
    }
    
}
