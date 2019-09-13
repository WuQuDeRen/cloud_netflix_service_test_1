package com.fj.boot.app.test;

import com.alibaba.fastjson.JSON;

class A {
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
public enum TestEnum {
    A, B;
    private TestEnum() {
        System.out.println();
    }
    public static void main(String[] args) {
       String json = "{\"a\": 12}";
       A a = JSON.parseObject(json, A.class);
        System.out.println(a);
    }
}
