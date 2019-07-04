/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datatable;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author alperk
 */
@ManagedBean(name = "sd")
@RequestScoped
public class StudentDetail {

    public ArrayList<Student> students;

    /**
     * Creates a new instance of StudentDetail
     */
    public StudentDetail() {
    }

    public ArrayList<Student> fetchData() {
        students = new ArrayList<>();

        Student s1 = new Student();
        s1.setName("Brad");
        s1.setRoll("1");
        students.add(s1);

        Student s2 = new Student();
        s2.setName("John");
        s2.setRoll("2");
        students.add(s2);

        return students;

    }

}
