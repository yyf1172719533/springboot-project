package com.timain.controller;

import com.timain.domain.User;
import com.timain.response.AjaxResult;
import com.timain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public AjaxResult save(@RequestBody User user) {
        user.setId(UUID.randomUUID().toString().replace("-", ""));
        userService.addData(user);
        return AjaxResult.success(200, "添加成功");
    }

    @PutMapping
    public AjaxResult update(@RequestBody User user) {
        userService.updateData(user);
        return AjaxResult.success(200, "修改成功");
    }

    @DeleteMapping
    public AjaxResult delete(@RequestBody User user) {
        userService.deleteData(user);
        return AjaxResult.success(200, "删除成功");
    }
}
