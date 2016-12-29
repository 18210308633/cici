package com.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式
 * 深复制、浅复制
 * Created by rensong.pu on 2016/12/28.
 */
public class ProtoType implements Serializable, Cloneable {
    private SerializableObj obj;

    private String str;

//    private static final long serialVersionUID = 1L;


    public Object clone() throws CloneNotSupportedException {
        ProtoType copy = (ProtoType) super.clone();
        return copy;
    }

    //深拷贝
    public Object deepClone() throws IOException, ClassNotFoundException {
        //用流的形式读入当前对象的二进制输入
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //读出二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public SerializableObj getObj() {
        return obj;
    }

    public void setObj(SerializableObj obj) {
        this.obj = obj;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

class SerializableObj implements Serializable {
    private static final long serialVersionUID = 1L;
}