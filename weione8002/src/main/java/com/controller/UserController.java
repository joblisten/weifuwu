package com.controller;

import com.exection.CommonResult;
import com.po.SysUser;
import com.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class UserController {
    @Autowired
    SysUserService  sysUserService;

    @Value("${server.port}")
    private String  po;
    @GetMapping("/sel/{id}")
    public @ResponseBody
    CommonResult select(@PathVariable("id")Long  id){
        log.info("查询成功");
        log.info("id={}",id);
        SysUser sysUser=sysUserService.selectById(id);
        log.info("sys={}",sysUser);

       return new CommonResult(200,"查询成功",sysUser+po);

    }

    @PostMapping("/up")
    public  CommonResult  up(@RequestBody String se){
        int row=sysUserService.UpById(se);
        if(row>0){
            log.info("添加成功");
            return new CommonResult(200,"添加成功",1);}
        else{
            log.info("添加失败");

        return new CommonResult(400,"添加失败",0);}
    }
}
