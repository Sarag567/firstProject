package org.example.stepdefs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class configuration {
    public void set (String key,String value) throws IOException {
        Properties pro=new Properties();
        FileInputStream file=new FileInputStream("config.properties");
        pro.load(file);
        pro.setProperty(key,value);
        file.close();
        FileOutputStream fileStreem=new FileOutputStream("config.properties");
        pro.store(fileStreem,"");
}
public void get(String key) throws IOException {
    Properties pro=new Properties();
    FileInputStream file=new FileInputStream("config.properties");
    pro.load(file);
    pro.getProperty(key);
    file.close();

}
}
