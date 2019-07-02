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
public class GetController {

    @RequestMapping("/get1")
    @ResponseBody
    public String get1(HttpServletRequest request){
        String name= request.getParameter("name");
        System.out.println(name);
        return name;
    }

    @RequestMapping("/get2")
    @ResponseBody
    public String get2(String name){
        System.out.println(name);
        return name;
    }

    @RequestMapping("/get3")
    @ResponseBody
    public String get3(@RequestParam("name") String name){
        System.out.println(name);
        return name;
    }

    @RequestMapping("/get4")
    @ResponseBody
    public String get4(Person person){
        System.out.println(person.getName());
        return person.getName();
    }

}
