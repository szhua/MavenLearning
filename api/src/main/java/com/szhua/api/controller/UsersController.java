package com.szhua.api.controller;


import com.szhua.api.ApiResponse;
import com.szhua.api.entity.Users;
import com.szhua.api.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author runer
 * @since 2019-09-03
 */
@RestController
@RequestMapping("//users")
public class UsersController {

    @Autowired
    IUsersService usersService ;


    @PostMapping("add")
    public ApiResponse add(@RequestBody Users users){
        usersService.save(users);
        return  ApiResponse.success(users);
    }

    @GetMapping("list")
    public ApiResponse list(){
        return  ApiResponse.success(usersService.list());
    }


    @GetMapping("detail")
    public ApiResponse detail(Long  id ){
        return  ApiResponse.success(usersService.getById(id));
    }

}
