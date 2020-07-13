package com.manage.local.localweb.controller;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author xiaoliuyang
 * @Date 2020/7/3 15:43
 * @Version 1.0
 **/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    /**
    * @Description:
    * @Author:      xiaoliuyang
    * @Param:
    * @return:
    * @Date:        2020/7/3
    */
    @RequestMapping("/getTest")
    @ResponseBody
    public String resultTestController(){

        for(int i = 0 ; i < 20 ; i++){
            System.out.println("this is quest"+i);
        }

        return "passssssssssssssssssssssssssss";

    }

}
