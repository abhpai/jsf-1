/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.abhpai;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;
/**
 *
 * @author abhpai
 */
public class ValueChange implements ValueChangeListener{

    /**
     * Creates a new instance of ValueChange
     */
    public ValueChange() {
    }

    @Override
    public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
        System.out.println(event.getOldValue()+"  "+event.getNewValue());
    }
    
}
