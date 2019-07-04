/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alperk
 */
@ManagedBean
@SessionScoped
public class LoginBean {

    public String username;
    public String password;

    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }

    public String doLogin() {
        if (username.equals("admin") && password.equals("admin")) {
            HttpSession hs = Util.getSession();
            hs.setAttribute("username", username);
            return "home";
        } else {
            FacesMessage fm = new FacesMessage("Login Error", "ERROR MSG");
            fm.setSeverity(FacesMessage.SEVERITY_ERROR);
            FacesContext.getCurrentInstance().addMessage(null, fm);
            return "login";
        }
    }

    public String doLogout() {
        HttpSession hs = Util.getSession();
        hs.invalidate();
        return "login?faces-redirect=true";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
