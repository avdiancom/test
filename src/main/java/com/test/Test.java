package com.test;

public class Test {
    private  String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test{" +
                "age='" + age + '\'' +
                '}';
    }
}
