package com.zhuchuansheng.controller;

import com.zhuchuansheng.entity.Employee;
import com.zhuchuansheng.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhuchuansheng
 * @date: 2019/12/2
 * @time: 16:46
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/queryAll")
    public List<Employee> queryAll(){

        return employeeService.queryAll();
    }


}
