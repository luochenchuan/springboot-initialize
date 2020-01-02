package com.zhuchuansheng.entity;

import java.io.Serializable;
import java.util.function.Predicate;

/**
 * @author zhuchuansheng
 * @date: 2019/12/2
 * @time: 16:32
 */
public class Employee implements Serializable {


    private int id;
    private String lastName;
    private String email;
    private Double salary;
    private int dept_id;

    public Employee() {

    }

    public Employee(int id, String lastName, String email, Double salary, int dept_id) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.dept_id = dept_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", dept_id=" + dept_id +
                '}';
    }
}
