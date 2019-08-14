package com.test.data.controller;

import com.test.data.model.User;
import com.test.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;

/**
 * Created by guanguan on 2017/7/20.
 */
@Controller
 public class controller {
    @Autowired
    UserService userService;

    @RequestMapping("/")
     public String index(ModelMap model){
         HashMap<String,Object> params= new HashMap<String, Object>();
        List<User> userList= userService.findBy(params);
         model.addAttribute("user",userList.get(0));
        return "index";
    }
}
