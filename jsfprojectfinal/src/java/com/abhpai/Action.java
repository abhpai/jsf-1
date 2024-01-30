/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.abhpai;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;



/**
 *
 * @author abhpai
 */
public class Action implements ActionListener{

    /**
     * Creates a new instance of Action
     */
    public Action() {
    }

    @Override
    public void processAction(ActionEvent event) throws AbortProcessingException {
        System.out.println("The Button ID is "+event.getComponent().getId());
    }
    
}
