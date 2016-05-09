package com.lhy.learnjava.object;

import com.lhy.learnjava.modal.Employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by xuhaitao on 16/5/9.
 */
public class WriteObject {
    public void write(){
        Employee e = new Employee();

        e.setName("lhy");
        e.setDesc("writeObject");
        e.setDepartment("Finance");

        try {
            FileOutputStream fs = new FileOutputStream("/Users/xuhaitao/lhydev/ideaspace/learnjava/temp/employdata.obj");
            ObjectOutputStream out = new ObjectOutputStream(fs);
            out.writeObject(e);
            out.close();
            fs.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
