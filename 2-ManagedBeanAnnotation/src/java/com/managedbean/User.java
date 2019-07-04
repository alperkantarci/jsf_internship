/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managedbean;

import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

//@RequestScoped
//
//Bean lives as long as the HTTP request-response lives. 
//It gets created upon a HTTP request and gets destroyed 
//when the HTTP response associated with the HTTP request is finished.

//@ViewScoped
//
//Bean lives as long as 
//the user is interacting with the same JSF view
//in the browser window/tab. It gets created 
//upon a HTTP request and gets destroyed 
//once the user postbacks to a different view.

@ManagedBean
@ViewScoped
public class User {
    
    public String name;

    /**
     * Creates a new instance of User
     */
    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
