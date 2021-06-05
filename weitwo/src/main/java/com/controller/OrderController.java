package com.controller;

import com.exection.CommonResult;
import com.po.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/com")
public class OrderController {

    @Autowired
    RestTemplate   restTemplate;


    //private static final String PAYMENT_URL = "http://localhost:8081";
    //这里生产者服务集群时，通过服务实例名字调用
    private static final String PAYMENT_URL = "http://PRAVITOR-SERVICE-8002";


    /*
    查询
    @PathVariable是路径上的值如/sel/1
    搭配的请求地址是{/sel/{id}}
    @Param(用于dao层)和@RequestParam(用于controller层)是请求体上的值如/sel?id=1，
    搭配的请求地址是{/sel}


     */
    @GetMapping("/sel/{id}")
    public CommonResult<SysUser> get(@PathVariable("id")Long  id) {

        System.out.printf(Long.toString(id));
        return restTemplate.getForObject(PAYMENT_URL + "/sel/" + id,
                CommonResult.class);
    }
    @GetMapping("/up")
    public CommonResult<SysUser> up(@RequestParam("se")  String  se ) {
        return restTemplate.postForObject(PAYMENT_URL+"/up",se,CommonResult.class);
    }
}
