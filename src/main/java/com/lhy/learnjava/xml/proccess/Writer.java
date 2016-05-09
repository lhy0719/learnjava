package com.lhy.learnjava.xml.proccess;

import com.lhy.learnjava.modal.Employee;
import com.thoughtworks.xstream.XStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Writer{

    public void write(){
        Employee e = new Employee();

            e.setName("lhy");
            e.setDesc("Manager");
            e.setDepartment("Finance");

            XStream xs = new XStream();

            try {
                FileOutputStream fs = new FileOutputStream("/Users/xuhaitao/lhydev/ideaspace/learnjava/temp/employdata.xml");
                xs.toXML(e, fs);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }
    public static void main (String[] args){
        Employee e = new Employee();

        e.setName("lhy");
        e.setDesc("Manager");
        e.setDepartment("Finance");

        XStream xs = new XStream();

        try {
            FileOutputStream fs = new FileOutputStream("/Users/xuhaitao/lhydev/ideaspace/learnxml/temp/employdata.xml");
            xs.toXML(e, fs);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}