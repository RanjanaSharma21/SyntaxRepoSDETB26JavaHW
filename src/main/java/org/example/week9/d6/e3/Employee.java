package org.example.week9.d6.e3;
/*
1. **Create the `Employee` class** with the following:
    - **Private Variables:**
        - Declare two private variables to store employee information:
            - `private String empName;`  to store the employee’s name
            - `private int empAge;`  to store the employee’s age
    - **Getter and Setter Methods:**
        - Create a public `getEmpName()` method to return the employee’s name.
        - Create a public `setEmpName(String name)` method to set the employee’s name.
        - Create a public `getEmpAge()` method to return the employee’s age.
        - Create a public `setEmpAge(int age)` method to set the employee’s age.

 */

public class Employee {
    private String empName;
    private int empAge;

    public String getEmpName() {
        return this.empName;
    }
    public int getEmpAge() {
        return this.empAge;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

}
