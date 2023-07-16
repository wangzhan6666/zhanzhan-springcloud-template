package com.wangzhan.controller;


import com.wangzhan.AjaxResult;
import com.wangzhan.mapper.UserMapper;
import com.wangzhan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wangzhan
 * @since 2023-07-16
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("list")
    public AjaxResult list() {

        return AjaxResult.success("查询成功", userService.list());
    }

}

