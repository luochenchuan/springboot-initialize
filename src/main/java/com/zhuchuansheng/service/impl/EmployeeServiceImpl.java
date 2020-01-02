package com.zhuchuansheng.service.impl;

import com.zhuchuansheng.dao.EmployeeDao;
import com.zhuchuansheng.entity.Employee;
import com.zhuchuansheng.service.EmployeeService;
import org.omg.PortableInterceptor.ObjectReferenceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhuchuansheng
 * @date: 2019/12/2
 * @time: 16:45
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> queryAll() {

        return employeeDao.queryEmployeeAll();
    }
}
