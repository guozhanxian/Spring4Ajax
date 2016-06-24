package com.ralph.second.test.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Ralph on 2016/6/23.
 */
public class Student implements Serializable
{
    private Integer id;
    private String name;
    private Date birth;

    public Student()
    {
    }

    public Student(Integer id, String name, Date birth)
    {
        this.id = id;
        this.name = name;
        this.birth = birth;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Date getBirth()
    {
        return birth;
    }

    public void setBirth(Date birth)
    {
        this.birth = birth;
    }
}
