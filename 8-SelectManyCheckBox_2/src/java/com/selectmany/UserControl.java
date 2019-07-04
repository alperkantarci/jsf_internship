/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selectmany;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author alperk
 */
@ManagedBean
@RequestScoped
public class UserControl {
    
    public Map<String, String> items;

    /**
     * Creates a new instance of UserControl
     */
    public UserControl() {
        items = new HashMap<>();
        items.put("C", "Programming in C");
        items.put("Java", "Programming in Java");
    }

    public Map<String, String> getItems() {
        return items;
    }

    public void setItems(Map<String, String> items) {
        this.items = items;
    }
    
    

}
