/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootsfaces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author alperk
 */
@ManagedBean
@RequestScoped
public class DateBean {

    public String cdate;

    /**
     * Creates a new instance of DateBean
     */
    public DateBean() {
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

}
