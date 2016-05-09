package com.lhy.learnjava.object;

import com.lhy.learnjava.modal.Employee;

import java.io.*;

/**
 * Created by xuhaitao on 16/5/9.
 */
public class ReadObject {

    public Employee read(){
        Employee e =new Employee();
        try {
            FileInputStream fi = new FileInputStream("/Users/xuhaitao/lhydev/ideaspace/learnjava/temp/employdata.obj");
            ObjectInputStream in = new ObjectInputStream(fi);
            e =(Employee)in.readObject();
            in.close();
            fi.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        return e;
    }
}
