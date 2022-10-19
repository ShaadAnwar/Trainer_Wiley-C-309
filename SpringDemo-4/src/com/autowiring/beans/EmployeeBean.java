package com.autowiring.beans;

public class EmployeeBean
{
    private String fullName;
      
    private DepartmentBean departmentBean1;
  
    public DepartmentBean getDepartmentBean() {
        return departmentBean1;
    }
  
    public void setDepartmentBean1(DepartmentBean departmentBean1) {
        this.departmentBean1 = departmentBean1;
    }
  
    public String getFullName() {
        return fullName;
    }
  
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    //Add parameterized constructor to set departmentBean if using byConstructor
}
