package com.example.controller;


import com.example.service.IDeptInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * <p>
 * 组织机构系统___部门信息表 前端控制器
 * </p>
 *
 * @author ML.Zhang
 * @since 2019-01-02
 */
@Controller
@RequestMapping("/deptInfo")
public class DeptInfoController  {

    @Autowired
    private IDeptInfoService ideptInfoService;

    @RequestMapping("/*")
    public void toHtml(){

    }


}

