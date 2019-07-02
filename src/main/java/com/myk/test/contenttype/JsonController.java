package com.myk.test.contenttype;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2019/6/26 0026.
 */

@Controller
public class JsonController {

    @RequestMapping("/application-json1")
    @ResponseBody
    public String json1(HttpServletRequest request){
        String name=(String)request.getParameter("name");
        System.out.println(name);
        return name;
    }

    @RequestMapping("/application-json2")
    @ResponseBody
    public String json2(String name){
        System.out.println(name);
        return name;
    }

    @RequestMapping("/application-json3")
    @ResponseBody
    public String json3(@RequestBody Person person){
        System.out.println(person.getName());
        return person.getName();
    }

}
