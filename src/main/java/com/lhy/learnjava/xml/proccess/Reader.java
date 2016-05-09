package com.lhy.learnjava.xml.proccess;

import com.lhy.learnjava.modal.Employee;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by xuhaitao on 16/5/7.
 */
public class Reader {

    public void read(){
        XStream xs = new XStream(new DomDriver());
        Employee e = new Employee();

        try {
            FileInputStream fis = new FileInputStream("/Users/xuhaitao/lhydev/ideaspace/learnjava/temp/employdata.xml");
            xs.fromXML(fis, e);

            System.out.println(e.toString());

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
