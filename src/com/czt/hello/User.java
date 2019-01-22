package com.czt.hello;

import java.util.Date;

public class User {
    private String id;

    private String name;

    private Integer age;

    private Date  brithDay;

    public User(String id, String name, Integer age, Date brithDay) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.brithDay = brithDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBrithDay() {
        return brithDay;
    }

    public void setBrithDay(Date brithDay) {
        this.brithDay = brithDay;
    }

    public User(String id) {

        this.id = id;
    }
}
