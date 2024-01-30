/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.abhpai;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author abhpai
 *//**
 *
 * @author abhpai
 */
@Named(value = "phaseListener")
@Dependent
public class PhaseListen implements PhaseListener{

    /**
     * Creates a new instance of PhaseListener
     */
    public PhaseListen() {
    }

    @Override
    public void afterPhase(PhaseEvent event) {
       System.out.println("After="+event.getPhaseId());
    }

    @Override
    public void beforePhase(PhaseEvent event) {
        System.out.println("Before="+event.getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {
      return PhaseId.ANY_PHASE;
    }
    
}
