package com.atguifu.bean;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Customer {
    private String name;
    private static int num;

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public static void main(String[] args) {
        System.out.println("HELLOWORLD!");
        ArrayList<Object> objects = new ArrayList<Object>();
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream("HELLOWORLD");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("HELLOWORLD");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        num = 0;
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("Customer.main");
        for (int i = 0; i < num; i++) {

        }
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            
        }
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            
        }
        ArrayList<Object> objects1 = new ArrayList<>();
        for (int i = 0; i < objects1.size(); i++) {
            
        }
        for (Object o : objects1) {
            
        }
        for (int i = objects1.size() - 1; i >= 0; i--) {
            
        }
    }

}
