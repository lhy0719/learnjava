package com.lhy.learnjava.modal;

import java.io.Serializable;

/**
 * Created by xuhaitao on 16/5/7.
 */
public class Employee implements Serializable{
    private String name;
    private String desc;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Name : "+this.name+
                "\nDesignation : "+this.desc+
                "\nDepartment : "+this.department;
    }
}
