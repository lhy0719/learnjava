package com.lhy.learnjava.object;

import com.lhy.learnjava.modal.Employee;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by xuhaitao on 16/5/9.
 */
public class ObjSerializableTest {

    @Test
    public void readObjectTest(){
        WriteObject w =new WriteObject();
        w.write();
    }

    @Test
    public void writeObjectTest(){
        ReadObject r =new ReadObject();
        Employee e =r.read();
        Assert.assertEquals(e,Employee.class);
    }
}
