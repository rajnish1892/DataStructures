package com.designpatterns;

import com.tricky.CustomException;

public class BuilderDesignPattern {
    public static void main(String args[]){
        Employee e = Employee.EmployeeBuilder.builder().age(30).department("Information Technology").name("Rajnish Kumar").empId(41535).build();
        System.out.println(e);
        try{
            throw new CustomException("It should not be here");
        }catch(Error ex){
            System.out.println("Here"+ex);
        }
    }
}
class Employee{
    private String name;
    private int empId;
    private int age;
    private String department;
    Employee(EmployeeBuilder empBuilder){
        this.name = empBuilder.name;
        this.age = empBuilder.age;
        this.empId = empBuilder.empId;
        this.department = empBuilder.department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }

    public static class EmployeeBuilder{
        private String name;
        private int empId;
        private int age;
        private String department;
        private static EmployeeBuilder empBuilder;
        public static EmployeeBuilder builder(){
            empBuilder = new EmployeeBuilder();
            return empBuilder;
        }
        public EmployeeBuilder name(String name){
            this.empBuilder.name = name;
            return this.empBuilder;
        }
        public EmployeeBuilder empId(int empId){
            this.empBuilder.empId = empId;
            return this.empBuilder;
        }
        public EmployeeBuilder age(int age){
            this.empBuilder.age = age;
            return this.empBuilder;
        }
        public EmployeeBuilder department(String dept){
            this.empBuilder.department = dept;
            return this.empBuilder;
        }
        public Employee build(){
            return new Employee(empBuilder);
        }

    }
}