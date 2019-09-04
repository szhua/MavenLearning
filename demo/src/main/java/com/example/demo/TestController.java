package com.example.demo;

import com.szhua.api.ApiResponse;
import com.szhua.api.service.IUsersService;
import com.szhua.api.service.impl.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author szhua
 * @Description:demo==
 * @Date 2019/9/4
 **/
@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    UsersServiceImpl usersService ;

    @GetMapping("test")
    public ApiResponse test(){
        return   ApiResponse.success(usersService.list()) ;
    }

}
