/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.checkbox;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author alperk
 */
@ManagedBean
@RequestScoped
public class UserControl {
    
    public boolean selectProperty;

    /**
     * Creates a new instance of UserControl
     */
    public UserControl() {
    }

    public boolean isSelectProperty() {
        return selectProperty;
    }

    public void setSelectProperty(boolean selectProperty) {
        this.selectProperty = selectProperty;
    }
    
    
    
}
