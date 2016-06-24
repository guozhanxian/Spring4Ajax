package com.ralph.second.test.web;

import com.ralph.second.test.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ralph on 2016/6/23.
 */
@Controller
public class HelloAction
{
    @RequestMapping("/hello")
    public String hello()
    {
        return "hello";
    }

    @ResponseBody
    @RequestMapping("/getAllStudents")
    public List<Student> findStudents()
    {
        List<Student> list = new ArrayList<Student>();
        Student s1 = new Student(1,"张三",new Date());
        Student s2 = new Student(1,"李四",new Date());
        Student s3 = new Student(1,"王五",new Date());

        list.add(s1);
        list.add(s2);
        list.add(s3);
        return list;
    }
}
