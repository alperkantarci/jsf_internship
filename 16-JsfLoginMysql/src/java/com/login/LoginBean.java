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

    //validate login
    public String validateUsernamePassword() {
        boolean valid = LoginDAO.validate(username, password);
        if (valid) {
            HttpSession session = Util.getSession();
            session.setAttribute("username", username);
            return "home";
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            "Please enter correct username and Password"));
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
