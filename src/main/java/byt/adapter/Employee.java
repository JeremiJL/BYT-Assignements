package byt.adapter;

import java.math.BigDecimal;

public class Employee {

    public int id;
    public String name;
    public String designation;
    public BigDecimal salary;

    public Employee(int id, String name, String designation, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
}
