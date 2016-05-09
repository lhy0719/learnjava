package com.lhy.learnjava.xml.proccess;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by xuhaitao on 16/5/7.
 */
@XStreamAlias("config")
public class ConfigReader {
    String datasourcename = null;
    String ipaddress = null;
    String logfilename = null;
    String appender = null;

    @Override
    public String toString() {
        // This method prints out the values stored in the member variables
        return "Datasource Name : "+datasourcename+
                " \nIP Address : "+ipaddress+
                " \nLogfilename : "+logfilename+
                " \nAppender : "+appender;
    }

    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        XStream xs = new XStream(new DomDriver());

        FileInputStream fis = new FileInputStream("/Users/xuhaitao/lhydev/ideaspace/learnjava/temp/config.xml");
        xs.aliasField("datasource-name", ConfigReader.class, "datasourcename");
//        xs.alias("config", ConfigReader.class);
        xs.processAnnotations(ConfigReader.class);
        ConfigReader r = (ConfigReader)xs.fromXML(fis);

        System.out.println(r.toString());
    }
}
