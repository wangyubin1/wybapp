package com.boot.wyb.controller;

import com.boot.wyb.Service.UserService;
import com.boot.wyb.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> hello(){
        List<User> hello=null;
        try {
            hello = userService.hello( );
        }catch (Exception e){
            System.out.println(e );
        }
        return hello;
    }
}
