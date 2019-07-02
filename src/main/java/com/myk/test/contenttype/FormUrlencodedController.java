package com.myk.test.contenttype;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2019/6/26 0026.
 */

@Controller
public class FormUrlencodedController {

    @RequestMapping("/x-www-form-urlencoded1")
    @ResponseBody
    public String form1(HttpServletRequest request){
        String name=(String)request.getParameter("name");
        System.out.println(name);
        return name;
    }

    @RequestMapping("/x-www-form-urlencoded2")
    @ResponseBody
    public String form2(String name){
        System.out.println(name);
        return name;
    }

    @RequestMapping("/x-www-form-urlencoded3")
    @ResponseBody
    public String form3(@RequestParam("name") String name){
        System.out.println(name);
        return name;
    }

    @RequestMapping("/x-www-form-urlencoded4")
    @ResponseBody
    public String form4(Person person){
        System.out.println(person.getName());
        return person.getName();
    }


}
